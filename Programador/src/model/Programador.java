package model;

/*
    Autor Ivan Montes 
*/
public class Programador{

    private double complemento;

    public Programador( String titualacion, String dni, String nombre, double salario_Base) {
        
        
        this.complemento = salario_Base*0.15;
        
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

	@Override
	public String toString() {
		return "Programador [complemento=" + complemento + "]";
	}
    
    

 

  
}
