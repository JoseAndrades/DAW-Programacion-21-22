/*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
* por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
* la salvedad de que el anterior estaba limitado a números de 5 dígitos como
* máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
* esta manera, la única limitación en el número de dígitos la establece el tipo de
* dato que se utilice */

package Ejercicios;

import java.util.Scanner;
public class Ej9 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
	    int numero = 0;
		int aux = 0;
		int contador = 0;
		
		System.out.print("Introduce un número y contaré los dígitos: ");
			numero= leer.nextInt();
		    
			do{ 
				aux = numero/10;
				contador++;
				numero = aux;
			}while(aux>0);
		     
		     System.out.println("El numero tiene  "+ contador + " digitos");
	}
}


	