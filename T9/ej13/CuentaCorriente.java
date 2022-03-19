package ej13;

public class CuentaCorriente {
	
	private String numero;
	private double saldo=0;
	
	//constructor
	public String generaNumero() {
		this.numero = "";
		for (int i = 0; i < 10; i++) {
			this.numero += (int) (Math.random() * 10);
		}
		return numero;
	}
	
	public CuentaCorriente() {
		this.generaNumero();
		
	}
	
	public CuentaCorriente(double saldo) {
		this.generaNumero();
		this.saldo = saldo;
		}


	//getters y setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	//instancias
	
	public void ingreso(int cantidad) {
		this.saldo+=cantidad;
	}
	
	public void cargo(int cantidad) {
		this.saldo-=cantidad;
	}
	
	
	public void transferencia(CuentaCorriente x, int cantidad ) {
		this.setSaldo(this.getSaldo()-cantidad);
		x.setSaldo(x.getSaldo()+cantidad);
	}

	
	//ToString
	
	@Override
	public String toString() {
		return "Nº cuenta: " + numero + ", saldo: " + String.format("%.2f", saldo) + "€";
	}
	
	
	
	
}
