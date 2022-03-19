import java.util.Scanner;

//Escribe un programa que pase de decimal a binario

public class ej18 {
	public static void main(String[]args) {
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Introduce un numero en decimal: ");
			Long dec=leer.nextLong();
		
			
		System.out.print("En binario sería: "+matematicas.conversorBinarios.dec_bin(dec));
		
	}
	
}
