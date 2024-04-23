package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Persona;
import util.Algoritmos;

class testEdad {
	
	@Test
	void testEdad() {
	
	Persona p1 = new Persona ("l","n",17);
		String mensajeEsperado="Es menor de edad";
		String mensajeObtenido = p1.mostrarEdad();
		assertEquals(mensajeEsperado,mensajeObtenido);

}
	
