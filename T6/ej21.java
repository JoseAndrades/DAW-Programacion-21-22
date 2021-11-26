import java.util.Scanner;

/*Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 c�ntimo, 2 c�ntimos,
5 c�ntimos, 10 c�ntimos, 20 c�ntimos, 50 c�ntimos, 1 euro y 2 euros. Las dos
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
					System.out.println("1 c�nt - "+moneda);
					break;
				case 1:
					System.out.println("2 c�nts - "+moneda);
					break;
				case 2:
					System.out.println("5 c�nts - "+moneda);
					break;
				case 3:
					System.out.println("10 c�nts - "+moneda);
					break;
				case 4:
					System.out.println("20 c�nts - "+moneda);
					break;
				case 5:
					System.out.println("50 c�nts - "+moneda);
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
