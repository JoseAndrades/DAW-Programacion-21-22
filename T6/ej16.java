/*Realiza un simulador de m�quina tragaperras simplificada que cumpla los
* siguientes requisitos:
* a) El ordenador mostrar� una tirada que consiste en mostrar 3 figuras. Hay 5
* figuras posibles: coraz�n, diamante, herradura, campana y lim�n.
* b) Si las tres figuras son diferentes se debe mostrar el mensaje �Lo siento, ha
* perdido�.
* c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje �Bien,
* ha recuperado su moneda�.
* d) Si las tres figuras son iguales se debe mostrar �Enhorabuena, ha ganado
* 10 monedas�.
*/

public class ej16 {
	public static void main(String[] args) {
		
		int nfigura=0;
		int aux1=0;
		int aux2=0;
		int aux3=0;
		String figura=" ";
		
			
			for(int i=0; i<3; i++) {
				nfigura=(int)(Math.random()*5)+1;
				
				switch(nfigura) {
					case 1:
						figura = "coraz�n";
						break;
					case 2:
						figura = "diamante";
						break;
					case 3:
						figura = "herradura";
						break;
					case 4:
						figura = "campana";
						break;
					case 5:
						figura = "lim�n";
						break;
				}
				switch(i) {
				case 0:
					aux1 = nfigura;
					break;
				case 1:
					aux2 = nfigura;
					break;
				case 2:
					aux3 = nfigura;
					break;
				}
				System.out.print(figura+" ");
			}
			
			
			if ((aux1 != aux2) && (aux2 != aux3) && (aux1 != aux3)) {
				System.out.println("\nLo siento, ha perdido.");
				} else if ((aux1 == aux2) && (aux2 == aux3)) {
				System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
				} else {
					System.out.println("\nBien, ha recuperado su moneda.");
					}
		
	}
}
