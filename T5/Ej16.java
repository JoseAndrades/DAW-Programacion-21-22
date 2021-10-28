/*Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.*/

package Ejercicios;

import java.util.Scanner;

public class Ej16 {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("Dime un numero y te dire si es primo o no: ");
			n=leer.nextInt();
		
		if(n%2!=0 && n%n>=0 && n%1>=0) {
			System.out.println("El numero "+n+" es primo");
		}else
			System.out.println("El numero "+n+" no es primo");
	}
}