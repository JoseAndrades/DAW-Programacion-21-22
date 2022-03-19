/*Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
 */

import java.util.Scanner;

public class ej6 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int [] array= new int [15];
		int aux=0;
		
		//Recogida de datos
		System.out.println("Introduce 15 numeros y los rotare: ");
		
		for(int i=0; i<array.length; i++) {
			array[i]=leer.nextInt();
			aux=array[14];
		}
		System.out.println();
		
		//Mostramos el array sin ordenar
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		//Mostramos el array ordenado
		System.out.print(aux+" ");
		for(int i=0; i<array.length-1; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
