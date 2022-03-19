package ej12;

public class Libro extends Publicacion implements Prestable {

	private boolean prestado=false;

	
	//constructor
	public Libro(String ISBN, String titulo, int añoPublicado) {
		super(ISBN, titulo, añoPublicado);
		
	}

	
	//getter y setters
	
	public boolean isPrestado() {
		return prestado;
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	//instancias
	
	@Override
	public void presta() {
		if (this.prestado) {
			System.out.println("Lo siento, ese libro ya está prestado.");
		} else {
			this.prestado = true;
		}
		
	}


	@Override
	public void devuelve() {
		this.prestado = false;
	}


	@Override
	public boolean estaPrestado() {
		return this.prestado;
	}
	
	
	//toString
	
	@Override
	public String toString() {
		return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
	}





	
	
	
}
