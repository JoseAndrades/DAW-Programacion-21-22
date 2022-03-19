package ej10;

public class Ameba {

	private int peso;
	
	
	//constructor
	public Ameba() {
		this.peso = 3;
	}

	
	//getter y setter
	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	//instancias
	 void come(int Pcomida) {
		this.peso+=Pcomida-1;
	}
	
	 void come(Ameba x) {
		 this.peso+= x.peso -1;
		 x.peso=0;
	 }


	@Override
	public String toString() {
		return "Soy una ameba y peso " + peso + " microgramos.";
	}
	
	 
	 
	
}
