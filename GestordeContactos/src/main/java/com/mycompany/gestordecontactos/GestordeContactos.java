/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestordecontactos;
import controlador.ControladorAgenda;
import modelo.Agenda;
import vista.VentanaAgenda;


/**
 *
 * @author gabby
 */
public class GestordeContactos {
 public static void main(String[] args) {


        Agenda modelo = new Agenda();

        VentanaAgenda vista = new VentanaAgenda();

        ControladorAgenda controlador = new ControladorAgenda(modelo, vista);

        controlador.iniciar();
    }
}


