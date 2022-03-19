/*Realiza un programa que muestre por pantalla un array de 10 filas por 10
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.
 */

public class ej12_2 {
	public static void main(String[]args) {
		
		int [][] array = new int [10][10];
		int [] diagonal= new int [10];
		int cont=0;
		int suma=0;
		int media=0;
		int min=900;
		int max=0;
		
		//Generamos el array
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				array[i][j]=(int)(Math.random()*401)+500;
			}
		}
		
		
		//Mostramos el array
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.printf("%4d", array[i][j]);
			}
			System.out.println();
		}
		
		
		//Recorremos la diagonal y lo almacenamos en un array
		for(int i=9; i>=0; i--) {
			diagonal[cont]=array[i][cont];
			cont++;
		}
		System.out.println();
		
		
		//Mostramos la diagonal y calculamos los valores que nos piden
		System.out.println("La diagonal es la siguiente:");
		for(int i=0; i<10; i++) {
			System.out.printf("%4d", diagonal[i]);
			
			suma=diagonal[i]+suma;
			if(min>diagonal[i]) {
				min=diagonal[i];
			}
			if(max<diagonal[i]) {
				max=diagonal[i];
			}
			
		}
		media=suma/10;
		System.out.println();
		System.out.println();
		System.out.println("El máx es "+max+", el mín es "+min+" y la media es "+media);
		
		
	}
}