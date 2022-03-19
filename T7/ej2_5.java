/*Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.
*/

public class ej2_5 {
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
		
		
		 
		 //Mostramos el array
		
		System.out.println("Array aleatorio generado:");
		 for(int i=0; i<6; i++) {
				for(int j=0; j<10; j++) {
					System.out.printf("%5d",array[i][j]);
					if(array[i][j]<min) {
						min=array[i][j];
						minX=i;
						minY=j;
					}
					if(array[i][j]>max) {
						maxX=i;
						maxY=j;
						max=array[i][j];
					}
				}
				System.out.println();
				
			}
		 System.out.println();
		 System.out.println("MAX:"+max+" MIN:"+min);
		 System.out.println("El MAX se encuentra en: "+maxX+"-"+maxY+"  El MIN se encuentra en: "+minX+"-"+minY);
		 
		 
	}
}
