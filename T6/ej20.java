/*Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.
*/

import java.util.Scanner;

public class ej20 {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		
		int capacidad=0;
		int agua=0;
		int vacio=0;
		
		System.out.print("¿Cuanta capacidad quieres que tenga la cuba?: ");
			capacidad=leer.nextInt();
			
			agua=(int)(Math.random()*capacidad+1);
			
			vacio=capacidad-agua;
			System.out.println();	
			
		for(int i=0; i<vacio; i++) {
			System.out.print("*     *");
			System.out.println();
		}
		for(int i=0; i<agua; i++) {
			System.out.print("*=====*");
			System.out.println();
		}
		System.out.println("*******");
		System.out.println();	
		System.out.println("La cuba tiene una capacidad de "+capacidad+" L, y contiene "+agua+" L de agua");	
			
	}
}
