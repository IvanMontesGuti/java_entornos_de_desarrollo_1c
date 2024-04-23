package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class testAlgoritmo {

	@Test
	void sumatorio1() {
		int sumaEsperada=10;
		int sumaObtenida = Algoritmos.sumatorio(4);
		assertEquals(sumaEsperada,sumaObtenida);

}
	@Test
	void factorial() {
		int factorialEsperado=24;
		int factorialObtenido = Algoritmos.factorial(4);
		assertEquals(factorialEsperado,factorialObtenido);

}
	@Test
	void sumatorioParamIncorrecto() {
		Exception excepcion = assertThrows(IllegalArgumentException.class,
				()->Algoritmos.sumatorio(-1));

		String esperado = "El numero debe ser igual o superior a 0";
				String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);

}
	@Test
	void sumatorioDe0() {
		int sumaEsperada=0;
		int sumaObtenida = Algoritmos.sumatorio(0);
		assertEquals(sumaEsperada,sumaObtenida);

}

}
