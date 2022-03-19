/*Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.
*/

import java.util.Scanner;

public class ej8 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int [] array= new int [12];
		int cont=0;
		
		//Recogida de datos
		System.out.println("Introduce la media de temperatura de cada mes del año, de enero a diciembre:");
				
			for(int i=0; i<array.length; i++) {
				array[i]=leer.nextInt();
			}
			System.out.println();
			
		//Pintamos el grafico
			for(int i=0; i<array.length; i++) {
				switch(i) {
					case 0:
						System.out.print("enero:     ");
						do{
							System.out.print("*");
							cont++;
						}while(cont!=array[i]);
						cont=0;
						System.out.println();
						break;
					case 1:
						System.out.print("febrero:   ");
						do{
							System.out.print("*");
							cont++;
						}while(cont!=array[i]);
						cont=0;
						System.out.println();
						break;
					case 2:
						System.out.print("marzo:     ");
						do{
							System.out.print("*");
							cont++;
						}while(cont!=array[i]);
						cont=0;
						System.out.println();
						break;
					case 3:
						System.out.print("abril:     ");
						do{
							System.out.print("*");
							cont++;
						}while(cont!=array[i]);
						cont=0;
						System.out.println();
						break;
					case 4:
						System.out.print("mayo:      ");
						do{
							System.out.print("*");
							cont++;
						}while(cont!=array[i]);
						cont=0;
						System.out.println();
						break;
					case 5:
						System.out.print("junio:     ");
						do{
							System.out.print("*");
							cont++;
						}while(cont!=array[i]);
						cont=0;
						System.out.println();
						break;
					case 6:
						System.out.print("julio:     ");
						do{
							System.out.print("*");
							cont++;
						}while(cont!=array[i]);
						cont=0;
						System.out.println();
						break;
					case 7:
						System.out.print("agosto:    ");
						do{
							System.out.print("*");
							cont++;
						}while(cont!=array[i]);
						cont=0;
						System.out.println();
						break;
					case 8:
						System.out.print("septiembre:");
						do{
							System.out.print("*");
							cont++;
						}while(cont!=array[i]);
						cont=0;
						System.out.println();
						break;
					case 9:
						System.out.print("octubre:   ");
						do{
							System.out.print("*");
							cont++;
						}while(cont!=array[i]);
						cont=0;
						System.out.println();
						break;
					case 10:
						System.out.print("noviembre: ");
						do{
							System.out.print("*");
							cont++;
						}while(cont!=array[i]);
						cont=0;
						System.out.println();
						break;
					case 11:
						System.out.print("diciembre: ");
						do{
							System.out.print("*");
							cont++;
						}while(cont!=array[i]);
						cont=0;
						System.out.println();
						break;
				}
			}
			
			
	}
}
