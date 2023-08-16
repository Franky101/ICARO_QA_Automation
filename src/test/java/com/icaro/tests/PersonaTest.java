package com.icaro.tests;

import Clase7.Persona;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonaTest {
    @Test
    public void validarNombre() {
        Persona persona = new Persona("Cesar", "Mejia", 30);
        Assert.assertEquals(persona.getNombre(),"Cesar");
    }
    @Test
    public void validarApellido() {
        Persona persona = new Persona("Cesar","Mejia",30);
        Assert.assertNotEquals(persona.getNombre(),"Cesar2");
    }
    @Test
    public void validarSaludos() {
        Persona persona = new Persona("Octavio","Mejia",30);
        Assert.assertTrue(persona.saludar().equals("Hola, soy Octavio Mejia"));
    }

}
