/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Agenda;
import modelo.Contacto;
import vista.VentanaAgenda;

/**
 *
 * @author gabby
 */
public class ControladorAgenda {
     private Agenda modelo;
    private VentanaAgenda vista;

    public ControladorAgenda(Agenda modelo, VentanaAgenda vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.getBtnGuardar().addActionListener(e -> guardarContacto());

        this.vista.getBtnBuscar().addActionListener(e -> buscarContacto());
    }
  public void iniciar() {
        vista.setTitle("Gestor de Contactos");   
        vista.setLocationRelativeTo(null);      
        vista.setVisible(true);                  
    }

 private void guardarContacto() {


        String nombre = vista.getNombre();
        String telefono = vista.getTelefono();

        if (nombre.equals("") || telefono.equals("")) {
            vista.mostrarMensaje("Debe ingresar el nombre y el teléfono.");
            return;  
        }

        Contacto nuevoContacto = new Contacto(nombre, telefono);
        boolean guardado = modelo.agregarContacto(nuevoContacto);

        if (guardado) {
            vista.mostrarMensaje("Contacto guardado correctamente.");
            vista.limpiarFormulario();
        } else {
            vista.mostrarMensaje("La agenda está llena.");
        }
    }

    private void buscarContacto() {


        String nombre = vista.getNombreBuscar();


        if (nombre.equals("")) {
            vista.mostrarMensaje("Ingrese un nombre para buscar.");
            return;
        }

        String telefono = modelo.buscarTelefono(nombre);
  if (telefono != null) {
            vista.setResultado("El teléfono de " + nombre + " es " + telefono);
        } else {
            vista.setResultado("Contacto no encontrado.");
        }
    }
}


    

