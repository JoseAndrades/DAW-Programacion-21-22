package ej5;

public class pizza {

	//atributos de clase
	private static int totalPedidas=0;
	private static int totalServidas=0;
	
	
	//atributos de instancia
	private String tamano;
	private String tipo;
	private String estado;
	
	
	//constructor
	public pizza(String tipo, String tamano) {
		this.tipo=tipo;
		this.tamano=tamano;
		this.estado="pedida";
		pizza.totalPedidas++;
	}
	
	
	//setter
	public void sirve() {
		if (this.estado.equals("pedida")) {
				this.estado = "servida";
				pizza.totalServidas++;
		} else {
				System.out.println("esa pizza ya se ha servido");
			}
	}

	
	//getter
	public String toString() {
		return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
	}
	
	public static int getTotalPedidas() {
		return pizza.totalPedidas;
	}
	
	public static int getTotalServidas() {
		return pizza.totalServidas;
	}

	
	
}
