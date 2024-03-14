package model;
import java.util.*;

public class Persona {


    public Persona() {
    }


    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    /**
     * @param dni 
     * @param nombre 
     * @param apellidos 
     * @param edad
     */
    public void Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni="4637573R";
        this.nombre="lucario";
        this.apellidos="morales";
        this.edad=33;
    }

    
     /* Modifica el DNI de la persona
     * @param dni
     */
    public void setDni(String dni) {
    }
    /* Devuelve el DNI de la persona
     * @return
     */
    public String getDni() {
        return "";
    }

    /*Modifica el nombre de la persona
     * @param nombre
     */
    public void setNombre(String nombre) {
    }

    /* Devuelve el nombre de la persona
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /* Modifica el apellido de la persona
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
    }

    /*Devuelve el apellido de la persona
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /* Modifica la edad de la persona
     * @param edad
     */
    public void setEdad(int edad) {
    }

    /*Devuelve la edad de la persona
     * @return
     */
    
    public int getEdad() {
        return edad;
    }

    //Devuelve el contenido del constructor
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

    
}