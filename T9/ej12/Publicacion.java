package ej12;

public class Publicacion {
	
	private  String ISBN;
	private String titulo;
	private int añoPublicado;
	
	
	public Publicacion(String ISBN, String titulo, int añoPublicado) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.añoPublicado = añoPublicado;
	}


	@Override
	public String toString() {
		return "ISBN: " + ISBN + ", titulo: " + titulo + ", año de publicación: " + añoPublicado;
	}
	
	
	
}
