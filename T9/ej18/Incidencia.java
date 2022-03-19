package ej18;

public class Incidencia {
	
	private int codigo;
	private int nPuesto;
	private String estado="";
	private String incidencia="";
	private String solucion="";
	
	private static int contadorCodigos = 1;
	private static int pendientes = 0;
	
	
	//Constructor
	public Incidencia(int nPuesto, String incidencia) {
		this.codigo = contadorCodigos++;
		this.nPuesto = nPuesto;
		this.estado = "pendiente";
		this.incidencia = incidencia;
		pendientes++;
	}
	
	
	//Getters y setters
	public static int getPendientes() {
		return pendientes;
	}

	
	//Instancias
	void resuelve(String solucion) {
		this.solucion=solucion;
		this.estado="resuelta";
		pendientes--;
	
	}
	
	


	//toString
	@Override
	public String toString() {
		return "Incidencia "+codigo + " -  Puesto: "+nPuesto+" - "+incidencia+" - "+estado+" - "+solucion;
	}
	
	
	
}
