import matematicas.varias;

//Muestra los números primos que hay entre 1 y 1000.


public class ej15 {
	public static void main (String[]args) {
	 
	int cont=0;
		
	for(int i=0;i<1000;i++) {
		if(matematicas.varias.esPrimo(i)==true) {
			System.out.printf("%4d",i);
			cont++;
			if(cont==50) {
				System.out.println();
				cont=0;
			}else
				continue;
		}else
			continue;
		
	}
		
		
		
	}
}
