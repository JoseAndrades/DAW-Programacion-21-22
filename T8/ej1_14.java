import matematicas.varias;
import java.util.Scanner;


public class ej1_14 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("PROGRAMAS DISPONIBLES: ");
		System.out.println("______________________");
		System.out.println();
		System.out.println("1.-esCapicua");
		System.out.println("2.-esPrimo");
		System.out.println("3.-siguientePrimo");
		System.out.println("4.-potencia");
		System.out.println("5.-digitos");
		System.out.println("6.-voltea");
		System.out.println("7.-digitoN");
		System.out.println("8.-posicionDeDigito");
		System.out.println("9.-quitaPorDetras");
		System.out.println("10.-quitaPorDelante");
		System.out.println("11.-pegaPorDetras");
		System.out.println("12.-pegaPorDelante");
		System.out.println("13.-trozoDeNumero");
		System.out.println("14.-juntaNumeros");
		System.out.println();
		System.out.print("¿Que programa quieres usar?: ");
			int sel=leer.nextInt();
		System.out.println();
		System.out.println();
			
		
			switch(sel) {
				case 1:
					System.out.print("||Programa 1: esCapicua||");
					System.out.println();
					System.out.println();
					System.out.print("¿Que valor quieres darle a x?: ");
						int a=leer.nextInt();
					matematicas.varias.mostrarEsCapicua(a);
					break;
				case 2:
					System.out.print("||Programa 2: esPrimo||");
					System.out.println();
					System.out.println();
					System.out.print("¿Que valor quieres darle a x?: ");
						 int b=leer.nextInt();
					matematicas.varias.mostrarEsPrimo(b);
					break;
				case 3:
					System.out.print("||Programa 3: siguientePrimo||");
					System.out.println();
					System.out.println();
					System.out.print("¿Que valor quieres darle a x?: ");
						 int c=leer.nextInt();
					matematicas.varias.mostrarSiguientePrimo(c);
					break;
				case 4:
					System.out.print("||Programa 4: potencia||");
					System.out.println();
					System.out.println();
					System.out.print("¿Que valor quieres darle a la base?: ");
						int d=leer.nextInt();
					System.out.print("¿Que valor quieres darle al exponente?: ");
						int e=leer.nextInt();
					matematicas.varias.mostrarPotencia(d,e);
					break;
				case 5:
					System.out.print("||Programa 5: digitos||");
					System.out.println();
					System.out.println();
					System.out.print("¿Que valor quieres darle a x?: ");
						int f=leer.nextInt();
					matematicas.varias.mostrarDigitos(f);
					break;
				case 6:
					System.out.print("||Programa 6: voltea||");
					System.out.println();
					System.out.println();
					System.out.print("¿Que valor quieres darle a x?: ");
						 long g=leer.nextLong();
					matematicas.varias.mostrarVoltea(g);
					break;
				case 7:
					System.out.print("||Programa 7: digitoN||");
					System.out.println();
					System.out.println();
					System.out.print("¿Que valor quieres darle a x?: ");
						 long h=leer.nextLong();
					System.out.print("¿Que cifra quieres consultar? y: ");
						 int i=leer.nextInt();	
					matematicas.varias.mostrarDigitoN(h,i);
					break;
				case 8:
					System.out.print("||Programa 8: posicionDeDigito||");
					System.out.println();
					System.out.println();
					System.out.print("¿Que numero quieres?: ");
						 long j=leer.nextLong();
					System.out.print("¿Que digito quieres encontrar?: ");
						 int k=leer.nextInt();	
					matematicas.varias.mostrarPosicionDeDigito(j,k);
					break;
			}
			
		
			
		
		
	}
}
