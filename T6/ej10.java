/*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
* El carácter con el que se pinta cada línea se elige de forma aleatoria entre
* uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
* aleatoria entre 1 y 40 caracteres.
*/

public class ej10 {
	public static void main(String[] args) {
		
		int ncaracter=0;
		String caracter="";
		int longitud=0;
		int contador=0;
		
		for(int i=0;i<10;i++) {
			longitud=(int)(Math.random()*40)+1;
			do {
				ncaracter=(int)(Math.random()*6)+1;
				
				switch(ncaracter) {
					case 1:
						caracter = "*";
						break;
					case 2:
						caracter = "-";
						break;
					case 3:
						caracter = "=";
						break;
					case 4:
						caracter = ".";
						break;
					case 5:
						caracter = " |";
						break;
					case 6:
						caracter = " @";
						break;
				
				}
				System.out.print(caracter);
				contador++;
			}while(longitud!=contador);
			contador=0;
			System.out.println();
		}
	}
}
