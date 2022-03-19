/*Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
*/

import java.util.Scanner; 

public class ej3 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int [] array = new int [10];
		
		System.out.println("Introduce 10 numeros por teclado y te los mostrare al reves: ");
			for(int i=0; i<array.length; i++) {
				array[i]=leer.nextInt();
			}
			System.out.println();
			for(int i=array.length-1; i>=0 ; i--){
				System.out.print(array[i]+" ");
			}
		
	}
}
