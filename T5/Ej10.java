/**Escribe un programa que calcule la media de un conjunto de n�meros positivos
* introducidos por teclado. A priori, el programa no sabe cu�ntos n�meros se
* introducir�n. El usuario indicar� que ha terminado de introducir los datos
* cuando meta un n�mero negativo.*/

package Ejercicios;

import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int numero=0;
		double total=0;
		int contador=0;
		double result=0;
		
		System.out.println("Introduce tantos valores como quieras y le hare la media (para parar introduce un negativo)");
		
		do {
			numero= leer.nextInt();
			if(numero>0) {
				total= numero +total;
				contador++;
			}else
				break;
			
		}while(numero>0);
		
		  result=total/contador;
		  
		System.out.println("La media es "+result);
			
				
		

	}

}
