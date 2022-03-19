/*Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda.
*/

import java.util.Scanner;

public class ej9 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int [] array = new int [8];
		
		//Recogida ded datos
		System.out.println("Introduce 8 enteros y te dire cual es par y cual impar: ");
			
		for(int i=0; i<array.length; i++) {
			array[i]=leer.nextInt();
		}
		System.out.println();
		//Salidad de datos
		
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0){
				System.out.println(array[i]+" par");
			}else
				System.out.println(array[i]+" impar");
		}
		
		
		
	}
}
