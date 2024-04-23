package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Model.Persona;


class TestPersona {

	@Test
	void testPersonaEdad0 () {
		 Persona p = new Persona ("angel", "apellido", 0);
	 String esperado = "Menor de edad";
	 String obtenido = p.mostrarEdad();
	 assertEquals(esperado, obtenido);
	}
	
	@Test
	void testPersonaEdad17 () {
	 Persona p = new Persona ("angel", "apellido", 17);
	 String esperado = "Menor de edad";
	 String obtenido = p.mostrarEdad();
	 assertEquals(esperado, obtenido);
	}
	
	@Test
	void testPersonaEdad18 () {
	 Persona p = new Persona ("angel", "apellido", 18);
	 String esperado = "Mayor de edad";
	 String obtenido = p.mostrarEdad();
	 assertEquals(esperado, obtenido);
	}
	
	@Test
	void testPersonaEdad65 () {
	 Persona p = new Persona ("angel", "apellido", 65);
	 String esperado = "Jubilado";
	 String obtenido = p.mostrarEdad();
	 assertEquals(esperado, obtenido);
	}
	
	@Test
	void testPersonaEdadInvalidadMenos1 () {
		Exception excepcion = assertThrows(IllegalArgumentException.class, 
				() -> new Persona("nomnre" , "apellido", -1));
	 String esperado = "La edad debe estar entre 0 y 130";
	 String obtenido = excepcion.getMessage();
	 assertEquals(esperado, obtenido);
	}

}
