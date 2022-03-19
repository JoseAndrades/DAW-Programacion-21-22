/*Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla
de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
 */

import java.util.Scanner;

public class ej7_2 {
	public static void main (String[]args) {
		 Scanner leer = new Scanner(System.in);
		 
		 
		 int x=0;
		 int y=0;
		 int cont=0;
		 int cordX=0;
		 int cordY=0;
		 boolean mina=false;
		 
		 
		 //Recogida de datos
		 System.out.println("¿Como quieres que sea el tablero:?");
		 System.out.print("ancho: ");
		 	x=leer.nextInt();
		 System.out.print("alto: ");
		 	y=leer.nextInt();
		 
		 System.out.println();
		 	
		 
		 //Creamos el tablero
		 int[][] tablero = new int [x][y];
		 int[][] valor = new int [x][y];
		 
		 for(int i=0; i<x; i++) {
			 for(int j=0; j<y; j++) {
				 valor[i][j]=(int)(Math.random()*2);
			 }
		 }
		 
		 
	
		 
		 do{
			 //Mostramos el tablero
			 System.out.println("BUSCAMINAS:");
			 
			 System.out.print(" ");
			 for(int i=0; i<y; i++) {
			 	System.out.printf("%3d",i);
			 }
			 
			 System.out.println();
			    
			    
			 for(int i=0; i<x; i++) {
				 System.out.print(i);
				 
					for(int j=0; j<y; j++) {
						System.out.printf("%3d", tablero[i][j]);
					}
					
					System.out.println();
				}
			 
			 
			 //Pedimos al jugador la cord
			 
			 System.out.println();
			 System.out.println("¿Qué coordenada eliges?:");
			 System.out.print("x: ");
			 	cordX=leer.nextInt();
			 System.out.print("y: ");
			 	cordY=leer.nextInt();
			 System.out.println();
				 
			 //Comprobamos si hay una mina
			 	
			if(valor[cordX][cordY]==1) {
				mina=true;
			}else
				tablero[cordX][cordY]=2;
			
		 }while(mina=false);
		 
		 System.out.println("HAS PERDIDO:");
		 
		 System.out.print(" ");
		 for(int i=0; i<y; i++) {
		 	System.out.printf("%3d",i);
		 }
		 
		 System.out.println();
		    
		    
		 for(int i=0; i<x; i++) {
			 System.out.print(i);
			 
				for(int j=0; j<y; j++) {
					System.out.printf("%3d", valor[i][j]);
				}
				
				System.out.println();
			}
	}
}
