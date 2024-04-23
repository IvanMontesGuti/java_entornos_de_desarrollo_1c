package app;

import models.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona1 =new Persona("Ivan","Montes",19);
		
		System.out.print(persona1.mostrarEdad(persona1.getEdad()));

	}

}
