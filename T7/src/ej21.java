/*Escribe un programa que rellene un array de 15 elementos con números enteros
comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
array “cincuerizado”, según el siguiente criterio: si el número que hay en una
posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
siguiente múltiplo de 5 que exista a partir de él.
 */


public class ej21 {
	public static void main (String[]args) {
		
		int [] array= new int[15];
		int [] arrayaux= new int[15];
		
		
		//Generamos el array aleatorio
		
		for(int i=0; i<array.length; i++) {
			array[i]=(int)(Math.random()*501);
		}
		
		//Mostramos el array generado
		
		 System.out.println("Array aleatorio generado:");
		 
		 for(int i=0; i<array.length; i++) {
			 System.out.printf("%4d",i);
		 }
		 System.out.println();
		 
		 for(int i=0; i<array.length; i++) {
			 System.out.printf("%4d",array[i]);
		 }
		 System.out.println();
		 
		 
		 //Cincuerizamos el array
		 
		 for(int i=0; i<array.length; i++) {
			 if(array[i]%5!=0) {
				 do {
					 array[i]++;
				 }while(array[i]%5!=0);
				 arrayaux[i]=array[i];
			 }else
				 arrayaux[i]=array[i];
		 }
		 
		 
		//Mostramos el array ordenado
		 
		 	System.out.println();	
			System.out.println("Array cincuerizado:");
			 
			 for(int i=0; i<arrayaux.length; i++) {
				 System.out.printf("%4d",i);
			 }
			 System.out.println();
			 
			 for(int i=0; i<arrayaux.length; i++) {
				 System.out.printf("%4d",arrayaux[i]);
			 }
			 System.out.println();
	}
}
