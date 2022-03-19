import matematicas.fArrays;
import java.util.Scanner;

public class ej29_34 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
	
		System.out.println("PROGRAMAS DISPONIBLES: ");
		System.out.println("______________________");
		System.out.println();
		System.out.println("1.-generaArrayBiInt");
		System.out.println("2.-filaDeArrayBiInt");
		System.out.println("3.-columnaDeArrayBiInt");
		System.out.println("4.-coordenadasEnArrayBiInt");
		System.out.println("5.-esPuntoDeSilla");
		System.out.println("6.-diagonal");
			System.out.println();
		System.out.print("¿Que programa quieres usar?: ");
			int sel=leer.nextInt();
			System.out.println();
			System.out.println();
			
		
		switch(sel) {
			case 1:
				System.out.print("||Programa 1: generaArrayBiInt||");
				System.out.println();
				System.out.println();
				System.out.println("Los valores por defecto son x=10, y=5, min=0 y max=100");
					System.out.println();
				matematicas.fArrays.mostrarGeneraArrayBiInt();
				break;
				
				
				
		}
	}
}
