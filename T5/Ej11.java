/**Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
* los 5 primeros números enteros a partir de uno que se introduce por teclado. */


package Ejercicios;

import java.util.Scanner;

public class Ej11 {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		
		int numero = 0;
		int valor=0;
		int cuadrado =0;
		int cubo=0;
		
		System.out.print("introduce un número y te diré el cuadrado y el cubo de los 5 contiguos: ");
			numero=leer.nextInt();
			
			for(int i=1; i<=5; i++) {
				valor=numero+i;
				cuadrado=valor*valor;
				cubo=cuadrado*valor;
				
			System.out.print(valor+"  "+cuadrado+"  "+cubo);
			System.out.println();
		}
		
	}

}
