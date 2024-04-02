package modelo;


import java.util.*;


public class Triangulo {

    /**
     * Default constructor
     */
    public Triangulo() {
    	this.base = 2;
    	this.altura =2;
    }

    private double base;
    private double altura;


    /**
     * @param base 
     * @param altura
     */
    public  Triangulo(double base, double altura) {
    	
    	this.base =base;
    	this.altura=altura;
    }


    public double getBase() {
        
    	return this.base;
    }

    /**
     * @param base
     */
    public void setBase(int base) {
        
    	this.base=base;
    }


    public double getAltura() {
        return this.altura;
    }

    /**
     * @param altura
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }


    /**
     * @param base 
     * @param altura
     */
    public double getArea() {
    	
    	return (base*altura)/2;
        
    }

    

}