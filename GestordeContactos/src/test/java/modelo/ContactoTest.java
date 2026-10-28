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

public class ContactoTest {

    @Test
    public void testCrearContacto() {
        Contacto contacto = new Contacto("Ana", "3001234567");

        assertEquals("Ana", contacto.getNombre());
        assertEquals("3001234567", contacto.getTelefono());
    }

    @Test
    public void testGetNombre() {
        Contacto contacto = new Contacto("Ana", "3001234567");

        assertEquals("Ana", contacto.getNombre());
    }

    @Test
    public void testSetNombre() {
        Contacto contacto = new Contacto("Ana", "3001234567");

        contacto.setNombre("Laura");

        assertEquals("Laura", contacto.getNombre());
    }

    @Test
    public void testGetTelefono() {
        Contacto contacto = new Contacto("Ana", "3001234567");

        assertEquals("3001234567", contacto.getTelefono());
    }

    @Test
    public void testSetTelefono() {
        Contacto contacto = new Contacto("Ana", "3001234567");

        contacto.setTelefono("3117654321");

        assertEquals("3117654321", contacto.getTelefono());
    }
}
