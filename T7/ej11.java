/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante.
*/

import java.util.Scanner;

public class ej11 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int [] array = new int [10];
		int [] arrayaux = new int [10];
		int cont=0;
		int aux=0;
		
		System.out.println("Este programa ordena un array colocando los primos en las primeras posiciones");
		
		//Recogemos los datos y los almacenamos en un array
		
		for(int i=0; i<array.length; i++) {
			array[i]=leer.nextInt();
		}
		
		
		//Mostamos el array generado
		
		System.out.println("Array generado:");
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		
		//Colocamos los primos al principio del array
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i]; j++) {
				if(array[i]%j==0 && aux>2) {
					aux++;
				}
				if(aux>2) {
					arrayaux[cont]=array[i];
					cont++;
				}
				aux=0;
			}
		}
		System.out.println();
		System.out.println();
		
		//Colocamos los no primos a partir del ultimo primo
		
		System.out.println("Array ordenado con los primos al principio:");
		
		for(int i=0; i<arrayaux.length; i++) {
			for(int j=0; j<array[i]; j++) {
				if(array[i]%j==0 && aux>2) {
					aux++;
				}
				if(aux<2) {
					arrayaux[cont]=array[i];
					cont++;
				}
				aux=0;
			}
		}
		
		
		//Mostamos el array ordenado
		
		System.out.println("Array ordenado con los primos al inicio:");
				
		for(int i=0; i<arrayaux.length; i++) {
			System.out.print(arrayaux[i]+" ");
		}
	}
}
