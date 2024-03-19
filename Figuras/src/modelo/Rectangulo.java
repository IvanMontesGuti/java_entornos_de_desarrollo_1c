package modelo;

import java.util.*;

public class Rectangulo {

    public Rectangulo() {
    }

 
    private int base;
    private int altura;

    /**
     * @param base 
     * @param altura
     */
    public void rectangulo() {
    	this.base=1;
    	this.altura=1;
        
    }

    /**
     * @param base 
     * @param altura
     */
    public void rectangulo(int base, int altura) {
    	
    	this.base=base;
    	this.altura=altura;
       
    }

    /**
     * @param base
     */
    public int getBase() {
        
    	return base;
    }

    /**
     * @return
     */
    public void setBase(int base2) {
       
    	this.base =base2;
        
    }

    /**
     * @param altura
     */
    public int getAltura() {
        
    	return this.altura;
    }

    /**
     * @return
     */
    public void setAltura(int altura2) {
        
        this.altura = altura2;
    }

    /**
     * @param altura 
     * @param base
     */
    public int Area(int altura, int base) {
        
    	return altura * base;
    }

    /**
     * @param altura 
     * @param base
     */
    public int Perimetro(int altura, int base) {
        
    	return (2*altura)+(2*base);
    }

}