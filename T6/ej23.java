/*Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
*/


public class ej23 {
	public static void main(String[] args) {
		
		int aleatorio=0;
		
		for(int i=0; i<5; i++) {
			aleatorio=(int)(Math.random()*6);
			
			switch(aleatorio) {
				case 0:
					System.out.print("As"+" ");
					break;
				case 1:
					System.out.print("K"+" ");
					break;
				case 2:
					System.out.print("Q"+" ");
					break;
				case 3:
					System.out.print("J"+" ");
					break;
				case 4:
					System.out.print("7"+" ");
					break;
				case 5:
					System.out.print("8"+" ");
					break;
			}
				
			
		}
	}
}
