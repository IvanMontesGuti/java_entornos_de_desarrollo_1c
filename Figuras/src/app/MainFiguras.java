package app;

import modelo.Circulo;
import modelo.Rectangulo;
import modelo.Triangulo;

public class MainFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Triangulo triangulo= new Triangulo (1,2);
		Double Area1 = triangulo.getArea();
		System.out.println("Area del triangulo: "+Area1);
		triangulo.setBase(2);
		Double Area2 = triangulo.getArea();
		System.out.println("Area del triangulo: "+Area2);
		Circulo circulo = new Circulo (2);
		circulo.getArea();
		circulo.setRadio(3);
		Double perimetro1 = circulo.getPerimetro();
		System.out.println(perimetro1);

	}

}
