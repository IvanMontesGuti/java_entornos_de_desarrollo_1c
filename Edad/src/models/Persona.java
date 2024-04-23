package models;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona() {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}
	
	/**
	 * 
	 * @param nombre nombre de la persona del objeto
	 * @param apellidos apellidos de la persona del objeto
	 * @param edad edad de la persona del objeto, deberá ser mayor de 0 y menor de 130
	 * @throws IllegalArgumentException
	 */
	public Persona(String nombre,String apellidos,int edad) {
		
		if (edad<0||edad>130) {
			throw new IllegalArgumentException("La edad debe estar entre 0 y 130");
		}
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		
		
	}
	/**
	 * Devuelve el nombre del objeto persona
	 * @return nombre del objeto persona
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Modifica el nombre del objeto persona
	 * @param nombre a asignar al atributo nombre del objeto persona
	 */
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	/**
	 * Devuelve el apellido del objeto persona
	 * @return apellidos del objeto persona
	 */
	public String getApellidos() {
		return this.apellidos;
	}
	
	/**
	 * Modifica los apellidos del objeto persona
	 * @param apellidos a asignar al atributo nombre del objeto persona
	 */
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	
	/**
	 * Devuelve la edad del objeto persona
	 * @return edad del objeto persona
	 */
	public int getEdad() {
		return this.edad;
	}
	
	/**
	 * Modifica la edad del objeto persona
	 * @param edad a asignar al atributo nombre del objeto persona
	 */
	public void setEdad(int edad) {
		this.edad=edad;
	}

	/**
	 * Comprueba si la edad introducida es menor de edad, mayor de edad, o jubilado
	 * @return menor de edad en caso de ser menor de 18, mayor de edad en caso de ser mayor de 18 y jubilado si es mayor a 65
	 */
	public  String mostrarEdad() {
		String mensaje ="";
		
		if (edad<18) {
			mensaje ="Menor de edad";
		}else if (edad>=18&&edad<65) {
			mensaje ="Mayor de edad";
		}else if(edad>=65) {
			mensaje ="Jubilado";
		}
		
		return mensaje;
	}
}
