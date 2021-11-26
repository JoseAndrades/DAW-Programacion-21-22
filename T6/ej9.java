/*Realiza un programa que vaya generando números aleatorios pares
* entre 0 y 100 y que no termine hasta que no saque el número 24. El
* programa deberá decir al final cuántos números se han generado.
*/
public class ej9 {
	public static void main(String[] args) {
		
		int aleatorio=0;
		int cont=0;
		
		do {
			aleatorio=(int)(Math.random()*101);
			if(aleatorio%2==0) {
				System.out.print(aleatorio+" ");
				cont++;
			}
		}while(aleatorio!=24);
		
		System.out.println();
		System.out.println("Se han generado un total de "+cont+" números");
	}
}
