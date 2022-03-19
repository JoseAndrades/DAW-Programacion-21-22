package Ej1;

public class Gato {

	private int edad;
	private String color;
	private String sexo;
	private String nombre;
	
	
	//Constructor
	public Gato(String nombre, String sexo,String color,int edad) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.color = color;
		this.edad = edad;
	}
	
	//getters y setters
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	//toString
	@Override
	public String toString() {
		return "Nombre: "+nombre+" /  Sexo: "+sexo+" /  Color: "+color+" /  Edad: "+edad;
	}

	


	
	
	
	
	
	
}
