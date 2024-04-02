package modelo;


import java.util.*;

public class Circulo {

	private double radio;
    private double pi = 3.14;
    /**
     * Default constructor
     */
    public Circulo() {
    	this.radio =1;
    	this.pi=3.14;    	
    }
    /**
     * @param radio 
     * @param pi
     */
    public Circulo(double radio) {	
    	this.radio = radio;
    	this.pi = 3.14;
    }
    public double getPi() {  
    	return this.pi;
    }
    /**
     * @param radio
     */
    public void setRadio(double radio) {   
    	this.radio=radio;
    }
    public double getRadio() {	
    	return this.radio;
    }
    /**
     * @param radio 
     * @param pi
     */
    public double getArea() {   
    	return pi*(radio*radio);
    }
    /**
     * @param radio 
     * @param pi
     */
    public double getPerimetro() {	
    	return 2*pi*radio;
    }
}