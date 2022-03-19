package ej2;
import java.util.Scanner;



/*Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreados y
kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
también algún método específico para cada una de las subclases. Prueba las
clases creadas mediante un programa con un menú como el que se muestra a
continuación:
VEHÍCULOS
=========
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):*/

public class ej2 {
	public static void main(String[]args) {
		Scanner leer = new Scanner(System.in);
		
		int sel; String color="";
		int al1=(int)(Math.random()*(18)+8);
		int al2=(int)(Math.random()*4);
		
			switch(al2) {
			case 0:
				color="amarillo";
				break;
			case 1:
				color="rojo";
				break;
			case 2:
				color="negro";
				break;
			case 3:
				color="azul";
				break;
			}
		
		bicicleta BMX = new bicicleta(al1);
		coche BMW = new coche(color);
		
		
		do {
			System.out.println("PROGRAMAS DISPONIBLES: ");
			System.out.println("______________________");
			System.out.println();
			System.out.println("1.-Anda con la bicicleta");
			System.out.println("2.-Haz el caballito con la bicicleta");
			System.out.println("3.-Anda con el coche");
			System.out.println("4.-Quema rueda con el coche");
			System.out.println("5.-Mostrar color coche");
			System.out.println("6.-Ver kilometraje de la bicicleta");
			System.out.println("7.-Ver kilometraje total");
			System.out.println("8.-Ver vehiculos creados");
			System.out.println("9.-Ver peso bicicleta");
			System.out.println("10.-Salir");
				System.out.println();
			System.out.print("¿Que programa quieres usar?: ");
				sel=leer.nextInt();
				System.out.println();
				System.out.println();
				
				
			switch(sel) {
				case 1:
					System.out.print("||Anda con la bicicleta||");
						System.out.println();
						System.out.println();
					System.out.print("¿Cuantos km quieres andar con la bicicleta?:");
						int km=leer.nextInt();
						System.out.println();
					BMX.recorre(km);
						System.out.println();
						System.out.println();
					break;
				case 2:
					System.out.print("||Haz el caballito con la bicicleta||");
						System.out.println();
						System.out.println();
				    BMX.hazCaballito();
						System.out.println();
						System.out.println();
					break;
				case 3:
					System.out.print("||Anda con el coche||");
					System.out.println();
					System.out.println();
					System.out.print("¿Cuantos km quieres andar con el coche?:");
						int km2=leer.nextInt();
						System.out.println();
					BMW.recorre(km2);
						System.out.println();
						System.out.println();
					break;
				case 4:
					System.out.print("||Quema rueda con el coche||");
						System.out.println();
						System.out.println();
					BMW.quemaRueda();
						System.out.println();
						System.out.println();
					break;
				case 5:
					System.out.print("||Muestra color coche||");
						System.out.println();
						System.out.println();
					BMW.mostrarColor();
						System.out.println();
						System.out.println();
					break;
				case 6:
					System.out.print("||Ver kilometraje de la bicicleta||");
						System.out.println();
						System.out.println();
					System.out.println("La bicicleta lleva "+BMX.getKilometrosRecorridos()+" km");
						System.out.println();
						System.out.println();
					break;
				case 7:
					System.out.print("||Ver kilometraje total||");
						System.out.println();
						System.out.println();
					System.out.println("En total se llevan "+vehiculo.getKilometrosTotales()+" km");
						System.out.println();
						System.out.println();
					break;
				case 8:
					System.out.print("||Ver vehiculos creados||");
						System.out.println();
						System.out.println();
					System.out.println("En total se han creado "+vehiculo.getVehiculosCreados()+" vehiculos");
						System.out.println();
						System.out.println();
					break;
				case 9:
					System.out.print("||Ver peso bicicleta||");
						System.out.println();
						System.out.println();
				BMX.mostrarPeso();
						System.out.println();
						System.out.println();
					break;
				
					
					
			}
		}while(sel!=10);
		
		
	}
}
