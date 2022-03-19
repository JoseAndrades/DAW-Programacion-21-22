package ej4;
import java.util.Scanner;


public class ej4 {
	public static void main(String[]args) {
		Scanner leer = new Scanner(System.in);
		
		int sel;long dem; long num;long dem2; long num2;
		
			
			
			
		do {
			System.out.println("PROGRAMAS DISPONIBLES: ");
			System.out.println("______________________");
			System.out.println();
			System.out.println("1.-Invierte");
			System.out.println("2.-Simplifica");
			System.out.println("3.-Suma");
			System.out.println("4.-Resta");
			System.out.println("5.-Multiplica");
			System.out.println("6.-Divide");
			System.out.println("7.-Denom comun");
			System.out.println("8.-Salir");
				System.out.println();
			System.out.print("¿Que programa quieres usar?: ");
				sel=leer.nextInt();
				System.out.println();
				System.out.println();
				
				
			switch(sel) {
				case 1:
					System.out.print("||Invierte||");
						System.out.println();
						System.out.println();
					System.out.print("Introduce el valor del num: ");
						num=leer.nextLong();
					System.out.print("Introduce el valor del dem: ");
						dem=leer.nextLong();
						
					fraccion a = new fraccion(num,dem);
					a.invertir(num,dem);
						System.out.println();
						System.out.println();
					break;
				case 2:
					System.out.print("||Simplificar||");
						System.out.println();
						System.out.println();
					System.out.print("Introduce el valor del num: ");
						num=leer.nextInt();
					System.out.print("Introduce el valor del dem: ");
						dem=leer.nextLong();
						
					fraccion b = new fraccion(num,dem);
					b.mostrarSimplifica(num,dem);
						System.out.println();
						System.out.println();
					break;
				case 3:
					System.out.print("||Suma||");
						System.out.println();
						System.out.println();
					System.out.print("Introduce el valor del num1: ");
						num=leer.nextLong();
					System.out.print("Introduce el valor del dem1: ");
						dem=leer.nextLong();
					System.out.print("Introduce el valor del num2: ");
						num2=leer.nextLong();
					System.out.print("Introduce el valor del dem2: ");
						dem2=leer.nextLong();
					fraccion c = new fraccion(num,dem);
					fraccion d = new fraccion(num2,dem2);
						System.out.println();
						System.out.println();
					break;
				case 4:
					fraccion.imprimirArrayPrimos();
					break;
				case 7:
					System.out.print("||Denominador común||");
						System.out.println();
						System.out.println();
					System.out.print("Introduce el valor del num1: ");
						num=leer.nextLong();
					System.out.print("Introduce el valor del dem1: ");
						dem=leer.nextLong();
					System.out.print("Introduce el valor del num2: ");
						num2=leer.nextLong();
					System.out.print("Introduce el valor del dem2: ");
						dem2=leer.nextLong();
						
					fraccion e = new fraccion(num,dem);
					fraccion f = new fraccion(num2,dem2);
					
					break;
			}
			
			
		}while(sel!=8);
		
		
		
		
	}
}
