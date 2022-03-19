package ej4;

public class denominador {

	//intancias de metodo
	
	
	public static int simplifica(long dem, int array[]) {
		
		int cont=2;
		
	
		do {
			if(dem%array[cont]==0) {
				dem=dem/array[cont];
			}else
			cont++;
			}while(dem!=array[cont]  && dem%array[cont]!=0 );
		
		return (int)dem;
	}
	
	
	
	public static int demComun(long dem, long dem2,int[]array) {
		int resultado=0; int cont=0;
		
			/*Factorizamos los dem*/
			
		do {
			if(dem%) {
				
			}
		}while();
		
		
		return (int)resultado;
	}
}
