package Ejercicios;

public class Ej3 {
	public static void main(String[] args) {
		int a = 5;
		int i = 0;
		int aux = 0;
		
		do {
			aux = a * i++;
			System.out.print(aux+" ");
		}while(aux<100);

	}

}
