package ej11;

import java.text.DecimalFormat;

public class TarjetaRegalo {

	private String numero;
	private double saldo;

	// constructor
	public TarjetaRegalo(double saldo) {
		super();
		this.saldo=saldo;
		this.numero = " ";
		for (int i = 0; i < 5; i++) {
			this.numero += (int) (Math.random() * 10);
		}
	}

	// getter y setter

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

	// instancias

	public void gasta(double num) {
		
		if (this.saldo-num < 0) {
			System.out.print("No tiene suficiente saldo para gastar " + num);
			System.out.println();
		} else {
			this.saldo = this.saldo - num;
		}
	}

	public TarjetaRegalo fusionaCon(TarjetaRegalo x) {
		double suma= this.getSaldo() +  x.getSaldo();
		this.setSaldo(0);
		x.setSaldo(0);
		
		return new TarjetaRegalo(suma);
	}

	@Override
	public String toString() {
		DecimalFormat dosDecimales = new DecimalFormat("0.00");
		return "Tarjeta Nº " + numero + " - saldo=" + dosDecimales.format(saldo) + "€";
	}

}
