/*Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes
*/


public class ej25 {
	public static void main(String[] args) {
		
		int aleatorio=0;
		
		for(int i=0; i<30; i++) {
			aleatorio=(int)(Math.random()*200);
			
			if(aleatorio%aleatorio==0 && aleatorio%1==0) {
				System.out.print("#"+aleatorio+"#"+" ");
				continue;
			}else if(aleatorio%5==0) {
				System.out.print("["+aleatorio+"]"+" ");
				continue;
			}
				System.out.print(aleatorio+" ");
				continue;
			
			
		}
	}
}
