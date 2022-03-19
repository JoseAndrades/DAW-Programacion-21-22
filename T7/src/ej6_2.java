/*Modifica el programa anterior de tal forma que no se repita ningún número en
el array.
 */

public class ej6_2 {
	public static void main (String[]args) {
		
		int[][] array = new int [6][10];
		int max=0;
		int min=1000;
		int maxY=0;
		int maxX=0;
		int minY=0;
		int minX=0;
		
		
		//Generamos el array aleatorio
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<10; j++) {
				
				array[i][j]=(int)(Math.random()*1001);
			}
		}
		
		
		
		
		
	}
}
