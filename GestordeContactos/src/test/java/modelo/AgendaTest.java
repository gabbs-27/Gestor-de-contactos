/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gabby
 */
 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
        
public class AgendaTest {
    @Test
    public void testAgregarContacto (){
    Agenda agenda = new Agenda();
    
    Contacto contacto = new Contacto (" Ana", "3001234567");
     agenda.agregarContacto(contacto);
     
     assertEquals(1, agenda.getCantidad());
    }
    
     @Test
    public void testBuscarTelefono() {
        Agenda agenda = new Agenda();
        Contacto contacto = new Contacto("Ana", "3001234567");
        agenda.agregarContacto(contacto);

        assertEquals("3001234567", agenda.buscarTelefono("Ana"));
    }

    @Test
    public void testBuscarTelefonoInexistente() {
        Agenda agenda = new Agenda();

        assertEquals(null, agenda.buscarTelefono("Carlos"));
    }

    @Test
    public void testGetCantidad() {
        Agenda agenda = new Agenda();
        agenda.agregarContacto(new Contacto("Ana", "3001234567"));

        assertEquals(1, agenda.getCantidad());
    }

    @Test
    public void testGetContactos() {
        Agenda agenda = new Agenda();

        assertEquals(100, agenda.getContactos().length);
    }

    @Test
    public void testSetContactos() {
        Agenda agenda = new Agenda();
        Contacto[] contactos = new Contacto[50];

        agenda.setContactos(contactos);

        assertEquals(50, agenda.getContactos().length);
    }

    @Test
    public void testSetCantidad() {
        Agenda agenda = new Agenda();

        agenda.setCantidad(5);

        assertEquals(5, agenda.getCantidad());
    }
}
