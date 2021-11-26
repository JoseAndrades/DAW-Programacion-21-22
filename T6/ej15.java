/*Realiza un generador de melodía con las siguientes condiciones:
* a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
* la y si.
* b) Una melodía está formada por un número aleatorio de notas mayor o igual
* a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
* c) Cada grupo de 4 notas será un compás y estará separado del siguiente
* compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
* con dos barras.
* d) La última nota de la melodía debe coincidir con la primera. 
*/

public class ej15 {
	public static void main(String[] args) {
		
		int aleatorio=0;
		int longitud=0;
		int cont=0;
		String nota="";
		
		//Generamos la longitud de la melodia
		
		do {
			longitud=(int)(Math.random()*29);
		}while(longitud%4!=0 || longitud==0);
		
		System.out.println(longitud);
		
		//Generamos las notas
		
		for(int i=0; i<longitud; i++) {
			
			aleatorio=(int)(Math.random()*8);
			
			switch(aleatorio) {
				case 1:
					nota = "Do";
					cont++;
					System.out.print(nota+" ");
					break;
				case 2:
					nota = "Re";
					cont++;
					System.out.print(nota+" ");
					break;
				case 3:
					nota = "Mi";
					cont++;
					System.out.print(nota+" ");
					break;
				case 4:
					nota = "Fa";
					cont++;
					System.out.print(nota+" ");
					break;
				case 5:
					nota = "Sol";
					cont++;
					System.out.print(nota+" ");
					break;
				case 6:
					nota = "La";
					cont++;
					System.out.print(nota+" ");
					break;
				case 7:
					nota = "Si";
					cont++;
					System.out.print(nota+" ");
					break;
			}
			if(cont>=4) {
				System.out.print("| ");
				cont=0;
			}
				
		}
		
	}
}
