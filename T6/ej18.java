/*Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja.
 */

public class ej18 {
	public static void main(String[] args) {
		
		String color="";
		String hab1="";
		String hab2="";
		String hab3="";
		int aleatorio=0;
		
		do {
			aleatorio=(int)(Math.random()*6)+1;
			
			switch(aleatorio) {
			
				case 1:
					color = "rojo";
					break;
				case 2:
					color = "azul";
					break;
				case 3:
					color = "verde";
					break;
				case 4:
					color = "amarillo";
					break;
				case 5:
					color = "violeta";
					break;
				case 6:
					color = "naranja";
					break;
					
			}
			
			if(hab1==hab2 || hab1==hab3) {
				hab1=color;
			}
			if(hab1==hab2 || hab2==hab3) {
				hab2=color;
			}
			
			if(hab3==hab2 || hab1==hab3 || hab3=="") {
				hab3=color;
			}
			
			
			
		}while(hab1==hab2 || hab2==hab3 || hab3==hab1);
		
		System.out.println("La habitación 1 sera de color "+hab1);
		System.out.println("La habitación 2 sera de color "+hab2);
		System.out.println("La habitación 3 sera de color "+hab3);
					
	}
}
