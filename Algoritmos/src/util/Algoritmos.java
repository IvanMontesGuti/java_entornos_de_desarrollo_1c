package util;

public abstract class Algoritmos {

	/**
	 * Devuelve el sumatorio del numero especificado
	 * @param numero   el numero del que queremos calcular el sumatorio
	 * @return         el sumatorio del numero especificado
	 */
	public static int sumatorio (int numero) {
		
		if (numero<0) {
			throw new IllegalArgumentException("El numero debe ser igual o superior a 0");
		}
		
		int numSumatorio =0;
		for(int i =0;i<=numero; i++) {
			numSumatorio += i;
		}
		return numSumatorio;
	}
	
	/**
	 * Devuelve el factorial del numero especificado
	 * @param n   el numero del que queremos calcular el factorial
	 * @return         el factorial del numero especificado
	 */
	public static int factorial (int n) {
		int numFactorial =1;
		for (int i = 1; i <= n; i++) {
            numFactorial = numFactorial * i;
        }
		return numFactorial;
	}
	
}
