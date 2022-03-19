package ej14;

public class FichaDomino {
	
	private int aux;
	private int num1;
	private int num2;
	

	//constructor
	public FichaDomino(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	//getter y setters
	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	//instancias
	
	public String voltea() {
		aux=this.num1;
		this.num1=num2;
		this.num2=aux;
		return toString();
	}
	
	public boolean encaja(FichaDomino x) {
		if(this.num1 == x.getNum1() || this.num2 == x.getNum2() || this.num1==x.getNum2() || this.num2==x.getNum1()) {
			return true;
		}
		return false;
	}

	
	//ToString
	@Override
	public String toString() {
		if(num1==0 && num2!=0) {
			return "[ "+ "|" + num2 + "]";
		} 
		
		if(num1!=0 && num2==0) {
			return "["+ num1 + "|" +" ]";
		} 
		
		if(num1==0 && num2==0) {
			return "[ "+ "|" +" ]";
		}
		if(num1!=0 && num2!=0) {
			return "["+ num1 + "|" + num2 + "]";
		}
		
		return " ";
	}
	
}
