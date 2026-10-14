/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gabby
 */
public class Agenda {
     private Contacto[] contactos;
     private int cantidad;
         
public Agenda() {
        contactos = new Contacto[100];
        cantidad = 0;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public boolean agregarContacto(Contacto contacto) {
        if (cantidad == contactos.length) {
                return false;

        }

        
        contactos[cantidad] = contacto;  // guarda el contacto
        cantidad = cantidad + 1;         // ahora hay uno más
        return true;
    }
 public String buscarTelefono(String nombre) {

        for (int i = 0; i < cantidad; i++) {

            if (contactos[i].getNombre().equals(nombre)) {
                return contactos[i].getTelefono();
            }
        }
                return null;
    }
}




