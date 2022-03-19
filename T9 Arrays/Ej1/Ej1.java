package Ej1;
import java.util.Scanner;

/*
 Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
todos los gatos utilizando también un bucle	
 */


public class Ej1 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		String nombre="";
		String sexo="";
		String color="";
		int edad=0;
		
		 Gato[] array = new Gato[4];
		
		 
		 //Rellenar datos
		 
		 for(int i=0; i<4; i++) {
			 array[i]=new Gato(nombre,sexo,color,edad);
			
			 System.out.println("MENU DE GATOS (gato "+(i+1)+"):");
			 System.out.println("pulsa intro para rellenar el gato");
			 leer.nextLine();
			 System.out.print("1-Introduce el nombre: ");
			 	nombre=leer.nextLine();
			 	array[i].setNombre(nombre);
			 System.out.print("2-Introduce el sexo(mach/hemb): ");
			 	sexo=leer.nextLine();
			 	array[i].setSexo(sexo);
			 System.out.print("3-Introduce el color: ");
				color=leer.nextLine();
				array[i].setColor(color);
			 System.out.print("4-Introduce la edad: ");
				edad=leer.nextInt();
				array[i].setEdad(edad);
			System.out.println();
			
			 
			
		 }
		 
		 
		 //Mostrar datos
		 for(int i=0; i<4; i++) {
			System.out.println(array[i]); 
		 }
			 
		
		
		 
		
	}
}
