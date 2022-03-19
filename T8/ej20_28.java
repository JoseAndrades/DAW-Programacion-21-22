import matematicas.fArrays;
import java.util.Scanner;

public class ej20_28 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("PROGRAMAS DISPONIBLES: ");
		System.out.println("______________________");
		System.out.println();
		System.out.println("1.-generaArrayInt");
		System.out.println("2.-minimoArrayInt");
		System.out.println("3.-maximoArrayInt");
		System.out.println("4.-mediaArrayInt");
		System.out.println("5.-estaEnArrayInt");
		System.out.println("6.-posicionEnArray");
		System.out.println("7.-volteaArrayInt");
		System.out.println("8.-rotaDerechaArrayInt");
		System.out.println("9.-rotaIzquierdaArrayInt");
			System.out.println();
		System.out.print("¿Que programa quieres usar?: ");
			int sel=leer.nextInt();
			System.out.println();
			System.out.println();
		
	
		switch(sel) {
			case 1:
				System.out.print("||Programa 1: generaArrayInt||");
				System.out.println();
				System.out.println();
				System.out.println("Los valores por defecto son x=20,mim=0,max=50");
					System.out.println();
				matematicas.fArrays.mostrarGenerarArrayInt();
				break;
			case 2:
				System.out.print("||Programa 2: minimoArrayInt||");
				System.out.println();
				System.out.println();
					System.out.println();
				matematicas.fArrays.mostrarMinimoArrayInt();
				break;
			case 3:
				System.out.print("||Programa 3: maximoArrayInt||");
				System.out.println();
				System.out.println();
					System.out.println();
				matematicas.fArrays.mostrarMaximoArrayInt();
				break;
			case 4:
				System.out.print("||Programa 4: mediaArrayInt||");
				System.out.println();
				System.out.println();
					System.out.println();
				matematicas.fArrays.mostrarMediaArrayInt();
				break;
			case 5:
				System.out.print("||Programa 5: estaEnArrayInt||");
				System.out.println();
				System.out.println();
				System.out.print("¿Que num quieres comprobar si está?: ");
					int a=leer.nextInt();
					System.out.println();
				matematicas.fArrays.mostrarEstaEnArrayInt(a);
				break;
			case 6:
				System.out.print("||Programa 6: posicionEnArray||");
				System.out.println();
				System.out.println();
				System.out.print("¿De que num quieres comprobar las posiciones?: ");
					int b=leer.nextInt();
					System.out.println();
				matematicas.fArrays.mostrarPosicionEnArray(b);
				break;
			case 7:
				System.out.print("||Programa 7: volteaArrayInt||");
				System.out.println();
				System.out.println();
				matematicas.fArrays.mostrarVolteaArrayInt();
				break;
			
		}

	}
}
