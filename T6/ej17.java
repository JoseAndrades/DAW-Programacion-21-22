
/*Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.
 */

import java.util.Scanner;

public class ej17 {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		
		int y=0;
		int x=0;
		
		System.out.print("Introduce la altura de la pecera: ");
			y=leer.nextInt();
		System.out.print("Introduce la anchura de la pecera: ");
			x=leer.nextInt();
		
		for(int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				
				
			}
		}
		
	}
}
