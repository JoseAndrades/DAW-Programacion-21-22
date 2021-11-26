/*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
* separados por espacios.
*/

public class ej4 {
	public static void main(String[] args) {
		
		int aleatorio=0;
		
		for(int i=0; i<10;i++) {
			aleatorio=(int)(Math.random()*11);
			System.out.print(aleatorio+" ");
		}
	}
}
