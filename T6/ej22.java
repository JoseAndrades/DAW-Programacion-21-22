/*Realiza un programa que pinte por pantalla una serpiente con un �serpenteo�
aleatorio. La cabeza se representar� con el car�cter @ y se debe colocar
exactamente en la posici�n 13 (con 12 espacios delante). A partir de ah�,
el cuerpo ir� serpenteando de la siguiente manera: se generar� de forma
aleatoria un valor entre tres posibles que har� que el siguiente car�cter se
coloque una posici�n a la izquierda del anterior, alineado con el anterior o una
posici�n a la derecha del anterior. La longitud de la serpiente se pedir� por
teclado y se supone que el usuario introducir� un dato correcto.
*/

import java.util.Scanner;

public class ej22 {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		
		int longitud=0;
		int aleatorio=0;
		
		System.out.print("�Cuanta longitud quieres que tenga la serpiente?: ");
			longitud=leer.nextInt();
			
			System.out.println();
			System.out.println("             @");
			System.out.println("             *");
			for(int i=0; i<longitud-1; i++) {
				
				aleatorio=(int)(Math.random()*3);
				
				if(aleatorio==0) {
					System.out.println("             *");
				}
				if(aleatorio==1) {
					System.out.println("              *");
				}
				if(aleatorio==2) {
					System.out.println("            *");
				}
				
			}
		
	}

}
