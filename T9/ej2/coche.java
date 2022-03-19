package ej2;

public class coche extends vehiculo {
	
	//atributos de subclase
	private String color;
	
	//constructor
	public coche(String color) {
		super();
		this.color = color;
	}
	
	
	//metodos instancia
	public void quemaRueda() {
		System.out.println("Fffshhhhhhhhhhh");
	}
	
	public void mostrarColor() {
		System.out.println("El color del coche es "+color);
	}
	
	
}
