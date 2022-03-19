package ej8;

public class movil extends terminal {
	
	private String tarifa;
	private double totalTarificado;
	
	
	//constructor
	public movil(String numero, String tarifa) {
		super(numero);
		this.tarifa=tarifa;
	}
	

	//getter y setter
	
	public String getTarifa() {
		return tarifa;
	}


	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}


	
	@Override
	public void llama(terminal t, int tiempo) {
		super.llama(t, tiempo);
		
		double min= (double) tiempo/60;
		
		switch(this.tarifa) {
			case "rata":
				this.totalTarificado+=min*0.06;
				
				break;
				
			case "mono":
				this.totalTarificado+=min*0.12;
				break;
				
			case "bisonte":
				this.totalTarificado+=min*0.3;
				break;
		}
		
		
	}


	@Override
	public String toString() {
	
	return "Nº " + this.getNumero()
	+ " - " + this.getDuracion()
	+ "s de conversación - tarificados "
	+ this.totalTarificado + " euros";
	}

	
	
	
	
	
	
	


	
	
	
}
