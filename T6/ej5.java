/*Muestra 50 n�meros enteros aleatorios entre 100 y 199 (ambos incluidos)
* separados por espacios. Muestra el m�ximo, el m�nimo y la media de esos n�meros.
*/
public class ej5 {
	public static void main(String[] args) {
		
		int aleatorio=0;
		int min=199;
		int max=0;
		int media=0;
	
		
		for(int i=0; i<50;i++) {
			aleatorio=(int)(Math.random()*100)+100;
			System.out.print(aleatorio+" ");
			
			if(aleatorio<min) {
				min=aleatorio;
			}
			if(aleatorio>max) {
				max=aleatorio;
			}
			
			media=aleatorio+media;
			
		}
		
		media=media/50;
		System.out.println();
		
		System.out.println("El m�nimo es: "+min);
		System.out.println("El m�ximo es: "+max);
		System.out.println("La media es: "+media);
	}
}
