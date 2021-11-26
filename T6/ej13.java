/*Escribe un programa que simule la tirada de dos dados. El programa deberá
* continuar tirando los dados una y otra vez hasta que en alguna tirada los
* dos dados tengan el mismo valor.
*/
public class ej13 {
	public static void main(String[] args) {
		
		int dado1=0;
		int dado2=0;
		int cont=0;
		
		do {
			dado1=(int)(Math.random()*6)+1;
			dado2=(int)(Math.random()*6)+1;
			cont++;
			
			System.out.println(cont+"º tirada, "+dado1+" - "+dado2);
			
		}while(dado1!=dado2);
	}
}
