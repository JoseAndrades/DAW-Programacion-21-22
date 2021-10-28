/*Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido
* por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
* la salvedad de que el anterior estaba limitado a n�meros de 5 d�gitos como
* m�ximo. En esta ocasi�n, hay que realizar el ejercicio utilizando bucles; de
* esta manera, la �nica limitaci�n en el n�mero de d�gitos la establece el tipo de
* dato que se utilice */

package Ejercicios;

import java.util.Scanner;
public class Ej9 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
	    int numero = 0;
		int aux = 0;
		int contador = 0;
		
		System.out.print("Introduce un n�mero y contar� los d�gitos: ");
			numero= leer.nextInt();
		    
			do{ 
				aux = numero/10;
				contador++;
				numero = aux;
			}while(aux>0);
		     
		     System.out.println("El numero tiene  "+ contador + " digitos");
	}
}


	