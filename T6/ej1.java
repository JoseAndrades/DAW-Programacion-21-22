/*
 *Escribe un programa que muestre la tirada de tres dados.
* Se debe mostrar también la suma total (los puntos que suman
* entre los tres dados).

 */
public class ej1 {
	public static void main(String[] args) {
		
		
		int tirada=0;
		int suma=0;
		
		
		System.out.println("Te mostrare la tirada de tres dados y su suma");
		
		for(int i=0; i<3; i++) {
			tirada=(int)(Math.random()*6)+1;
			System.out.println("DADO "+(i+1)+": "+tirada);
			suma=suma+tirada;
		}
		System.out.println("La suma de las tiradas es: "+suma);
	}
}
		