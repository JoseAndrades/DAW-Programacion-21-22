/*Escribe un programa que piense un n�mero al azar entre 0 y 100. El usuario debe
* adivinarlo y tiene para ello 5 oportunidades. Despu�s de cada intento fallido, el
* programa dir� cu�ntas oportunidades quedan y si el n�mero introducido es menor o
* mayor que el que ha pensado. 
*/

import java.util.Scanner;

public class ej6 {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		
		int aleatorio=0;
		int num=0;
		int intentos=5;
		
		System.out.println("Voy a pensar un n�mero del 0 al 100, tendras 5 oportnidades para adivinarlo");
		aleatorio=(int)(Math.random()*101);
		
		do{
			System.out.print("�Que n�mero crees que es?: ");
				num=leer.nextInt();
				
				if(num<aleatorio) {
					System.out.println("El n�mero es mayor que el que has dicho");
					intentos--;
				}
				
				if(num>aleatorio) {
					System.out.println("El n�mero es menor que el que has dicho");
					intentos--;
				}
				
				if(num==aleatorio) {
					System.out.println("��Has acertado!! Te quedaban "+intentos+" intentos.");
					break;
				}
				
				System.out.println();
		}while(intentos!=0);
		
		System.out.println("�Te has quedao sin intentos! El numero era el "+aleatorio);
		
		
	}
}
