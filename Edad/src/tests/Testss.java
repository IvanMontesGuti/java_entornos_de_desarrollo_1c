package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Persona;

class Testss {

	@Test
	void testEdadMenor() {
	
	    Persona p1 = new Persona ("l","n",17);
		String mensajeEsperado="Menor de edad";
		String mensajeObtenido = p1.mostrarEdad();
		assertEquals(mensajeEsperado,mensajeObtenido);

}
	@Test
	void testEdadMayor() {
	
	    Persona p1 = new Persona ("l","n",18);
		String mensajeEsperado="Mayor de edad";
		String mensajeObtenido = p1.mostrarEdad();
		assertEquals(mensajeEsperado,mensajeObtenido);

}
	@Test
	void testEdadCasiJubilado() {
	
	    Persona p1 = new Persona ("l","n",64);
		String mensajeEsperado="Mayor de edad";
		String mensajeObtenido = p1.mostrarEdad();
		assertEquals(mensajeEsperado,mensajeObtenido);

}
	@Test
	void testEdadJubilado() {
	
	    Persona p1 = new Persona ("l","n",65);
		String mensajeEsperado="Jubilado";
		String mensajeObtenido = p1.mostrarEdad();
		assertEquals(mensajeEsperado,mensajeObtenido);

}
	@Test
	void testEdadParamLimit() {
	
	    Persona p1 = new Persona ("l","n",130);
		String mensajeEsperado="Jubilado";
		String mensajeObtenido = p1.mostrarEdad();
		assertEquals(mensajeEsperado,mensajeObtenido);

}
	@Test
	void testEdadParamLimiteArriba() {

		Exception excepcion = assertThrows(IllegalArgumentException.class,
				()->new Persona ("l","n",-1).mostrarEdad());

		String esperado = "La edad debe estar entre 0 y 130";
				String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);


}
	@Test
	void testEdadParamLimiteAbajo() {
		
		Exception excepcion = assertThrows(IllegalArgumentException.class,
				()->new Persona ("l","n",-1).mostrarEdad());

		String esperado = "La edad debe estar entre 0 y 130";
				String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);


}
	@Test
	void testEdadParam0() {
	
	    Persona p1 = new Persona ("l","n",0);
		String mensajeEsperado="Menor de edad";
		String mensajeObtenido = p1.mostrarEdad();
		assertEquals(mensajeEsperado,mensajeObtenido);

}

}
