/*Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados
*/

public class ej19 {
	public static void main(String[] args) {
		
		int aleatorio=0;
		int max=0;
		int min=0;
		int media=0;
		int cont=0;
		
		for(int i=0;i<50;i++) {
			
			aleatorio=(int)(Math.random()*301)-100;
			
			cont=aleatorio+cont;
			
			if(aleatorio%2==0 && aleatorio>max) {
				max=aleatorio;
			}
			if(aleatorio%2!=0 && aleatorio<min) {
				min=aleatorio;
			}
		System.out.print(aleatorio+" ");
				
		}
		
		media=cont/50;
		
		System.out.println();
		System.out.println("El mayor de los pares es "+max);
		System.out.println("El menor de los impares es "+min);
		System.out.println("La media de todos los números es "+media);
		
	}
}
