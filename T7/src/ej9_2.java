/*Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados. 
 */


public class ej9_2 {
	public static void main (String[]args) {
		
	int [][] array= new int [12][12];	
	int [][] arrayaux= new int [12][12];	
	
	//Rellenamos la matriz
	
	for(int i=0; i<array.length; i++) {
		for(int j=0; j<array.length; j++) {
			array[i][j]=(int)(Math.random()*101);
		}
	}
	
	
	//La mostramos por pantalla
	
	System.out.println("Matriz generada aleatoriamente:");
	
	 System.out.print("  ");
	 
	 for(int i=0; i<array.length; i++) {
	 	System.out.printf("%5d",i);
	 }
	 System.out.println();
	       
	 for(int i=0; i<array.length; i++) {
		 if(i<10) {
			 System.out.print(" "+i);
		 }else
			 System.out.print(i);
		
		 for(int j=0; j<array.length; j++) {
			System.out.printf("%5d", array[i][j]);
		 }
		 System.out.println();
	 }
		
	 
	 
	}
}
