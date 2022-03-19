/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario
*/


public class ej10 {
	public static void main(String[] args) {
		
		int [] array = new int [20];
		int [] arrayaux = new int [20];
		int cont=0;
		
		System.out.println("Este programa ordena un array aleatorio colocando los pares en las primeras posiciones");
		System.out.println();
		
		//Generamos los numeros aleatorios y los almacenamos en un array
		
		for(int i=0; i<array.length; i++) {
			array[i]=(int)(Math.random()*101);
		}
		
		
		//Mostamos el array generado
		
		System.out.println("Array aleatorio generado:");
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		
		//Colocamos los pares al principio del array
		
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0) {
				arrayaux[cont]=array[i];
				cont++;
			}
		}
		
		//Colocamos los impares a partir del ultimo impar
		
		for(int i=0; i<arrayaux.length; i++) {
			if(array[i]%2!=0) {
				arrayaux[cont]=array[i];
				cont++;
			}
		}
		
		
		//Mostamos el array ordenado
		
		System.out.println("Array ordenado con los pares al inicio:");
				
		for(int i=0; i<arrayaux.length; i++) {
			System.out.print(arrayaux[i]+" ");
		}
		
	}
}
