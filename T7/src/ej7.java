/*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados.
*/

import java.util.Scanner;

public class ej7 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int [] array= new int [50];
		int num1=0;
		int num2=0;
		
			//Recogida de datos
			System.out.println("Estos son los numeros aleatorios generados:");
				
				for(int i=0; i<array.length; i++) {
					array[i]=(int)(Math.random()*21);
				}
			
			//Mostramos el array sin ordenar
				for(int i=0; i<array.length; i++) {
					System.out.print(array[i]+" ");
				}
				System.out.println();
				System.out.println();
			
			//Pedimos los numeros para cambiar
			System.out.print("¿Que número quieres sustituir?: ");
				num1=leer.nextInt();
			System.out.print("¿Por qué número quieres sustituirlo?: ");
				num2=leer.nextInt();
				
			//Mostramos el array ordenado
				for(int i=0; i<array.length-1; i++) {
					if(array[i]==num1) {
						System.out.print("'"+num2+"'"+" ");
					}else
						System.out.print(array[i]+" ");
				}
				
				
	}
}
