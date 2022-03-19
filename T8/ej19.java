import java.util.Scanner;


/*Une y amplía los dos programas anteriores de tal forma que se permita
convertir un número entre cualquiera de las siguientes bases: decimal, binario,
hexadecimal y octal.*/

public class ej19 {
	public static void main(String[]args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("CONVERSORES DISPONIBLES:");
		System.out.println("________________________");
			System.out.println();
			System.out.println();
		System.out.println("1.-Binario a decimal");
		System.out.println("2.-Binario a hexadecimal");
		System.out.println("3.-Binario a octal");
		System.out.println("4.-Decimal a binario");
		System.out.println("5.-Decimal a octal");
		System.out.println("6.-Decimal a hexadecimal");
		System.out.println("7.-Hexadecimal a decimal");
		System.out.println("8.-Hexadecimal a binario");
		System.out.println("9.-Hexadecimal a octal");
		System.out.println("10.-Octal a hexadecimal");
		System.out.println("11.-Octal a decimal");
		System.out.println("12.-Octal a binario");
			System.out.println();
		System.out.print("¿Que conversor quieres usar?:");
			int sel=leer.nextInt();
		
		System.out.println();
		System.out.println();
		
		switch(sel) {
		case 1:
			System.out.println("||Conversor de binario a decimal||");
			System.out.print("bin: ");
				String bin=leer.nextLine();
			System.out.print("dec:"+ matematicas.conversorBinarios.bin_dec(bin));
			break;
		case 2:
			System.out.println("||Conversor de binario a hexadecimal||");
			System.out.print("bin: ");
				String bin2=leer.nextLine();
			System.out.print("dec:"+ matematicas.conversorBinarios.bin_dec(bin2));
			break;
		case 3:
			System.out.println("||Conversor de binario a octal||");
			System.out.print("bin: ");
				String bin3=leer.nextLine();
			System.out.print("dec:"+ matematicas.conversorBinarios.bin_dec(bin3));
			break;
		case 4:
			System.out.println("||Conversor de decimal a binario||");
			System.out.print("dec: ");
				long dec=leer.nextLong();
			System.out.print("bin:"+ matematicas.conversorBinarios.dec_bin(dec));
			break;
		case 5:
			System.out.println("||Conversor de decimal a octal||");
			System.out.print("dec: ");
				int dec2=leer.nextInt();
			System.out.print("oct:"+ matematicas.conversorBinarios.dec_oct(dec2));
			break;
		case 6:
			System.out.println("||Conversor de decimal a hexadecimal||");
			System.out.print("dec: ");
				int dec3=leer.nextInt();
				System.out.print("hex:"+ matematicas.conversorBinarios.dec_hex(dec3));
			break;
		case 7:
			System.out.println("||Conversor de hexadecimal a binario||");
			System.out.print("hex: ");
				String hex2=leer.nextLine();
			System.out.print("bin:");
			break;
			
		}
	}
}
