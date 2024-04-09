package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class testAlgoritmo {

	@Test
	void sumatorio() {
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

}
