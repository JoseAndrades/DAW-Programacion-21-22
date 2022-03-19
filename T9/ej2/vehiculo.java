package ej2;

public abstract class vehiculo {
	
	//atributos de clase
	private static int vehiculosCreados;
	private static int kilometrosTotales;
	
	
	//atributos de instancias
	private int kilometrosRecorridos;
	
	
	//constructor
	public vehiculo() {
		this.kilometrosRecorridos = 0;
		vehiculosCreados++;
	}
	
	
	//getter
	public int getKilometrosRecorridos() {
		return this.kilometrosRecorridos;
	}
	
	public static int getKilometrosTotales() {
		return vehiculo.kilometrosTotales;
	}
	
	public static int getVehiculosCreados() {
		return vehiculo.vehiculosCreados;
	}
	
	
	
	//setter
	
	public void recorre(int km) {
		this.kilometrosRecorridos += km;
		vehiculo.kilometrosTotales += km;
	}
	
	
	

}

