/*Escribe un programa que pida 10 n�meros por teclado y que luego muestre los
n�meros introducidos junto con las palabras �m�ximo� y �m�nimo� al lado del
m�ximo y del m�nimo respectivamente.
*/

import java.util.Scanner;

public class ej5 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int [] array= new int [10];
		int min=0;
		int nmin=0;
		int max=0;
		int nmax=0;
		int aux=0;
		
		System.out.println("Introduce 10 numeros por teclado y te dire el maximo y minimo: ");
		for(int i=0; i<array.length; i++) {
			array[i]=leer.nextInt();
			
			if(min>array[i]) {
				min=array[i];
				nmin=i;
			}
			if(max<array[i]) {
				max=array[i];
				nmax=i;
			}
		}
		
		System.out.println();
		
		
		for(int i=0; i<array.length; i++) {
			if(nmax==i) {
				System.out.println(array[i]+" maximo");
				aux++;
			}
			if(nmin==i) {
				System.out.println(array[i]+" minimo");
				aux++;
			}
			if(aux==0) {
				System.out.println(array[i]);
			}
			aux=0;
				
		}
		
	}
}
