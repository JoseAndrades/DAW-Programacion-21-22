/*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de
* 48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.
*/

public class ej3 {
	public static void main(String[] args) {
	
		//Palo de la baraja
		
		String palo= " ";
		int npalo=0;
				
				
		npalo=(int)(Math.random()*4)+1;
					
			switch(npalo) {
				case 1:
					palo = "oros";
					break;
				case 2:
					palo = "copas";
					break;
				case 3:
					palo = "espadas";
					break;
				case 4:
					palo = "bastos";
					break;
					
			}
			
		//Numero de la carta
			
		String carta=" ";
		int ncarta = 0;
			
		ncarta=(int)(Math.random()*13)+1;
			
			switch(ncarta) {
				case 1:
					carta = "AS";
					break;
				case 11:
					carta = "sota";
					break;
				case 12:
					carta = "caballo";
					break;
				case 13:
					carta = "rey";
					break;
						
				default:
					carta = String.valueOf(ncarta);
			}
				
		System.out.println(carta+" de "+palo);
					
					
					
	}
}
