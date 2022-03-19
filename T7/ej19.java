/*Realiza un programa que sea capaz de insertar un número en una posición
concreta de un array. En primer lugar, el programa generará un array de 12
números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
el programa preguntará por el número que se quiere insertar y por la posición
donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
siempre se perderá.
*/

import java.util.Scanner;

public class ej19 {
	public static void main (String[]args) {
		 Scanner leer = new Scanner(System.in);
		 
		 int [] array = new int [12];
		 int [] arrayaux = new int [12];
		 int aux=0;
		 int posc=0;
		 int num=0;
		 
		 
		 //Generamos el array aleatorio
		 
		 for(int i=0; i<array.length; i++){
			 array[i]=(int)(Math.random()*201);
		 }
		 
		 //Mostramos el array aleatorio por pantalla
		 
		 System.out.println("Array aleatorio generado:");
		 
		 for(int i=0; i<array.length; i++) {
			 System.out.printf("%4d",i);
		 }
		 System.out.println();
		 
		 for(int i=0; i<array.length; i++) {
			 System.out.printf("%4d",array[i]);
		 }
		 System.out.println();
		 
		 
		 //Recogida de datos 
		System.out.println();
		System.out.print("¿Qué número quieres añadir a la lista?: ");
			num=leer.nextInt();
		System.out.print("¿En que posición quieres añadirlo?: ");
			posc=leer.nextInt();
		System.out.println();
			
		
		//Ordenamos de nuevo el array
			
		for(int i=0; i<posc; i++) {
			arrayaux[i]=array[i];
		}
		
		arrayaux[posc]=num;
		
		for(int i=posc; i<arrayaux.length-1; i++ ) {
			aux=array[i];
			arrayaux[i+1]=aux;
		}
		
		
		//Mostramos el array ordenado
		
		System.out.println("Array ordenado:");
		 System.out.println();
		 
		 for(int i=0; i<arrayaux.length; i++) {
			 System.out.printf("%4d",i);
		 }
		 System.out.println();
		 
		 for(int i=0; i<arrayaux.length; i++) {
			 System.out.printf("%4d",arrayaux[i]);
		 }
		 System.out.println();
	}
}
