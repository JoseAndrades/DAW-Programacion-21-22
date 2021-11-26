/*Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
* adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el
* programa dirá cuántas oportunidades quedan y si el número introducido es menor o
* mayor que el que ha pensado. 
*/

import java.util.Scanner;

public class ej6 {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		
		int aleatorio=0;
		int num=0;
		int intentos=5;
		
		System.out.println("Voy a pensar un número del 0 al 100, tendras 5 oportnidades para adivinarlo");
		aleatorio=(int)(Math.random()*101);
		
		do{
			System.out.print("¿Que número crees que es?: ");
				num=leer.nextInt();
				
				if(num<aleatorio) {
					System.out.println("El número es mayor que el que has dicho");
					intentos--;
				}
				
				if(num>aleatorio) {
					System.out.println("El número es menor que el que has dicho");
					intentos--;
				}
				
				if(num==aleatorio) {
					System.out.println("¡¡Has acertado!! Te quedaban "+intentos+" intentos.");
					break;
				}
				
				System.out.println();
		}while(intentos!=0);
		
		System.out.println("¡Te has quedao sin intentos! El numero era el "+aleatorio);
		
		
	}
}
