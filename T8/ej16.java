import matematicas.varias;

//Muestra los números capicúa que hay entre 1 y 99999.

public class ej16 {
	public static void main (String[]args) {
		 
		int cont=0;
			
		for(int i=1;i<99999;i++) {
			if(matematicas.varias.esCapicua(i)==true) {
				System.out.printf("%6s",i);
				cont++;
				if(cont==30) {
					System.out.println();
					cont=0;
				}else
					continue;
			}else
				continue;
			
		}
		
	}
			
}
