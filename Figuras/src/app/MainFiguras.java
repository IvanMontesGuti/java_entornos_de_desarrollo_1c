package app;

import modelo.Circulo;
import modelo.Rectangulo;

public class MainFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Rectangulo rectangulo1 = new Rectangulo (2,4);
		Circulo circulo1 = new Circulo (3);
		
		
		System.out.println("Perimetro de rectangulo: "+rectangulo1.Perimetro());
		System.out.println("Area de rectangulo: "+rectangulo1.Area());
		System.out.println("Perimetro del círculo: "+circulo1.getPerimetro());
		System.out.println("Area del círculo: "+circulo1.getArea());
	}

}
