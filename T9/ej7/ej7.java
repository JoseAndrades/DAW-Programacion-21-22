package ej7;

import java.util.Scanner;

/*Queremos gestionar la venta de entradas (no numeradas) de Expocoches
Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles, 
la zona de compra-venta con 200 entradas disponibles y la zona vip
con 25 entradas disponibles. Hay que controlar que existen entradas antes de
venderlas.*/

public class ej7 {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int sel; int zona; int entrada;
		
		zona principal = new zona(1000); 
		zona compraVenta = new zona(200); 
		zona vip = new zona(25); 
		
		
		do{
			System.out.println("1. Mostar número  de entradas libres");
			System.out.println("2. Vender entradas");
			System.out.println("3. Salir");
				sel=leer.nextInt();
			System.out.println();
			
			switch(sel) {
				case 1:
					System.out.print("¿De que zona? (1.Principal / 2.Compra-venta / 3.Vip): ");
						zona=leer.nextInt();
						
						switch(zona){
							case 1:
								System.out.println(principal.getEntradasPorVender());
								break;
							case 2:
								System.out.println(compraVenta.getEntradasPorVender());
								break;
							case 3:
								System.out.println(vip.getEntradasPorVender());
								break;
									
						}
						System.out.println();
						break;
						
				case 2:
					System.out.print("¿De que zona? (1.Principal / 2.Compra-venta / 3.Vip): ");
						zona=leer.nextInt();
					System.out.print("¿Cuantas entradas quieres vender?: ");
						entrada=leer.nextInt();
					
						switch(zona){
							case 1:
								principal.vender(entrada);
								break;
							case 2:
								compraVenta.vender(entrada);
								break;
							case 3:
								vip.vender(entrada);
								break;
									
						}
						System.out.println();
						break;
				case 3:
					break;
			}
				
				
		}while(sel!=3);
		
		
		
		
		
		
	}
}
