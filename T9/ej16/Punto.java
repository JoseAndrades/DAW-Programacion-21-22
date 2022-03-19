package ej16;

public class Punto {

	private double x;
	private double y;
	
	//constructor
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}


	//getters y setters
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}



	//toString
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}	
	
	
	
}
