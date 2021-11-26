import java.util.Scanner;

/*Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.
*/

public class ej21 {
	public static void main(String[] args) {
		
	String moneda ="";
	int aleatorio=0;
	
		for(int i=0; i<8; i++) {
			aleatorio=(int)(Math.random()*2);
			
			if(aleatorio==0) {
				moneda="cara";
			}else
				moneda="cruz";
			
			switch(i){
				case 0:
					System.out.println("1 cént - "+moneda);
					break;
				case 1:
					System.out.println("2 cénts - "+moneda);
					break;
				case 2:
					System.out.println("5 cénts - "+moneda);
					break;
				case 3:
					System.out.println("10 cénts - "+moneda);
					break;
				case 4:
					System.out.println("20 cénts - "+moneda);
					break;
				case 5:
					System.out.println("50 cénts - "+moneda);
					break;
				case 6:
					System.out.println("1 euro - "+moneda);
					break;
				case 7:
					System.out.println("2 euros - "+moneda);
					break;
			}
		}
		
	}
}
