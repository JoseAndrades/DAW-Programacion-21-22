package ej2;

public class bicicleta extends vehiculo {
	
	//atributos de la subclase
	private int peso;
	
	
	//constructor
	public bicicleta(int peso) {
		super();
		this.peso = peso;
	}
	
	//getter
	

	//metodos de instancias
	public void hazCaballito() {
		System.out.println("Estoy haciendo el caballito");
	}
	
	public void mostrarPeso() {
		System.out.println("La bici pesa "+peso+" kg");
	}
}
