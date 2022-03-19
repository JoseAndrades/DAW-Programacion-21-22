/*Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.
*/

import java.util.Scanner;

public class ej14 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int cont=0;
		int[] indice=new int[8];
		String[]array=new String[8];
		String[]arrayaux=new String[8];
		String[]colores=new String[9];
		
		//Metemos los colores en un String
		for(int i=0; i<colores.length;i++) {
			switch(i) {
			case 0:
				colores[i]="verde";
				break;
			case 1:
				colores[i]="rojo";
				break;
			case 2:
				colores[i]="azul";
				break;
			case 3:
				colores[i]="amarillo";
				break;
			case 4:
				colores[i]="naranja";
				break;
			case 5:
				colores[i]="rosa";
				break;
			case 6:
				colores[i]="negro";
				break;
			case 7:
				colores[i]="blanco";
				break;
			case 8:
				colores[i]="morado";
				break;
				
			}
		}
		
		//Recogidad de datos
		
		System.out.println("Introduce 8 palabras y te devolveré el array con los colores primero:");
		
		for(int i=0; i<array.length; i++) {
			array[i]=leer.nextLine();
		}
		System.out.println();
		
		
		//Mostamos el array generado
		
		System.out.println("Array sin ordenar:");
				
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		
		//Colocamos los colores al inicio
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<colores.length; j++){
				if(array[i].equalsIgnoreCase(colores[j])) {
					arrayaux[cont]=array[i];
					cont++;
					indice[cont]=i;
				}
					
			}
		}
		
		
		//Colocamos las demas palabras detras
		for(int i=0;i<indice.length;i++) {
			System.out.print(indice[i]+" ");
		}
		
		//Mostamos el array ordenado
		
		System.out.println("Array ordenado:");
						
		for(int i=0; i<arrayaux.length; i++) {
			System.out.print(arrayaux[i]+" ");
		}
		System.out.println();
		System.out.println();
		
	}
}
