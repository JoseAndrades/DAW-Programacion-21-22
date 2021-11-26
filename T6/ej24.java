/*Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos.
*/

import java.util.Scanner;

public class ej24 {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		
		int num=0;
		String Snum="";
		int dig=0;
		int longitud=0;
		int aleatorio=0;
		
		//Recogida de datos
		System.out.print("Escribe un número y te dire un digito al azar: ");
			num=leer.nextInt();
			
		//Pasamos el num a string
			 Snum = String.valueOf(num);
		//Calculamos la longitud del num
			 longitud = String.valueOf(num).length();
		//Generamos un valor aleatorio de 0 a la longitud
			 aleatorio=(int)(Math.random()*longitud);
		//Cogemos el digito de la posicion aleatoria
			 dig = Character.digit(Snum.charAt(aleatorio), 10);
			
			 
			 System.out.println("El dígito aleatorio es el "+dig+" de la posición "+(aleatorio+1));
			 
		
	}
}
