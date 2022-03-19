/*Realiza un programa que sea capaz de insertar un n�mero en una posici�n
concreta de un array. En primer lugar, el programa generar� un array de 12
n�meros enteros aleatorios entre 0 y 200 ambos incluidos. A continuaci�n se
debe mostrar el contenido de ese array junto al �ndice (0 � 11). Seguidamente
el programa preguntar� por el n�mero que se quiere insertar y por la posici�n
donde ser� insertado. Los n�meros del array se desplazan a la derecha para
dejar sitio al nuevo. El �ltimo n�mero (el que se encuentra en la posici�n 11)
siempre se perder�.
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
		System.out.print("�Qu� n�mero quieres a�adir a la lista?: ");
			num=leer.nextInt();
		System.out.print("�En que posici�n quieres a�adirlo?: ");
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
