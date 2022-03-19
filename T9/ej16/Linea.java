package ej16;

public class Linea {

	private Punto a;
	private Punto b;
	
	//constructor
	public Linea(Punto a , Punto b) {
		this.a=a;
		this.b=b;
	}


	//toString
	@Override
	public String toString() {
		return "Linea formada por los puntos" + a + " y " + b;
	}
	

}
