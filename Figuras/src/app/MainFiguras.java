package app;

import modelo.Rectangulo;

public class MainFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Rectangulo rectangulo1 = new Rectangulo (2,4);
		
		
		System.out.println("Perimetro: "+rectangulo1.Perimetro());
		System.out.print("Area: "+rectangulo1.Area());
	}

}
