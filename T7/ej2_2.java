/*Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.
 */

import java.util.Scanner;

public class ej2_2 {
	public static void main (String[]args) {
		 Scanner leer = new Scanner(System.in);
		 
		 int[][] num = new int[5][5]; 
		 int suma=0;
		 
		 //Recogida de datos
		 
		 System.out.println("Introduce 20 numeros enteros:");
		 
		 for(int i=0; i<4; i++) {
			 for(int j=0; j<5; j++) {
				 num[i][j]=leer.nextInt();
			 }
			 System.out.println();
		 }
		 
		 
		 //Mostramos el array
		 
		 for(int i=0; i<4; i++) {
				for(int j=0; j<5; j++) {
					System.out.printf("%3d",num[i][j]);
				}
				System.out.println();
			}
		 
		 
		 //Calculamos la suma de las columnas
		 

		 
		 //Mostramos el array con las sumas
		 
		 System.out.println("Array con la suma:");
		 for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.printf("%3d",num[i][j]);
				}
				System.out.println();
			}
		 
	}
}
