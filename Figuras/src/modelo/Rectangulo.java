package modelo;

import java.util.*;

public class Rectangulo {

    public Rectangulo() {
    	this.base=1;
    	this.altura=1;
        
    	
    }

 
    private int base;
    private int altura;

    /**
     * @param base 
     * @param altura
     */
    
    //constructor por defecto con base y altura a 1
    public Rectangulo(int base , int altura) {
    	
    	this.base=base;
    	this.altura=altura;
    	
    }

    /**
     * @param base
     */
    
    
    public int getBase() {
        
    	return this.base;
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
    
    //devuelve el area del rectangulo
    public int Area() {
        
    	return altura * base;
    }

    /**
     * @param altura 
     * @param base
     */
    
    //devuelve el perimetro del rectangulo
    public int Perimetro() {
        
    	return (2*altura)+(2*base);
    }

}