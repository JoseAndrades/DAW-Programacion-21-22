package ej12;

public class Publicacion {
	
	private  String ISBN;
	private String titulo;
	private int a�oPublicado;
	
	
	public Publicacion(String ISBN, String titulo, int a�oPublicado) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.a�oPublicado = a�oPublicado;
	}


	@Override
	public String toString() {
		return "ISBN: " + ISBN + ", titulo: " + titulo + ", a�o de publicaci�n: " + a�oPublicado;
	}
	
	
	
}
