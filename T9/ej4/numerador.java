package ej4;

 public class numerador{
	
	
	//getter
	
	public static int simplifica(long num, int array[]) {
		
		int cont=0;
		
		do {
			if(num%array[cont]==0) {
				num=num/array[cont];
			}else
			cont++;
			}while(num!=array[cont]  && num%array[cont]!=0 );
		
		return (int)num;
			
	}
	
	
	public static int sumar(int num, int num2, int array[]) {
		
		return num;
	}
	
	
}
