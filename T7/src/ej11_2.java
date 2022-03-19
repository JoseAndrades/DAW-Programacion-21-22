/*Realiza un programa que muestre por pantalla un array de 10 filas por 10
columnas relleno con n�meros aleatorios entre 200 y 300. A continuaci�n, el
programa debe mostrar los n�meros de la diagonal que va desde la esquina
superior izquierda a la esquina inferior derecha, as� como el m�ximo, el m�nimo
y la media de los n�meros que hay en esa diagonal.
 */

public class ej11_2 {
	public static void main(String[]args) {
		
		int [][] array = new int [10][10];
		int [] diagonal= new int [10];
		int cont=0;
		int suma=0;
		int media=0;
		int min=300;
		int max=0;
		
		//Generamos el array
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				array[i][j]=(int)(Math.random()*101)+200;
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
		for(int j=0; j<10; j++) {
			diagonal[j]=array[cont][j];
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
		System.out.println("El m�x es "+max+", el m�n es "+min+" y la media es "+media);
		
		
	}
}
