package ej4;

public class fraccion {
	
	//atributos instancia
	private static long num;
	private static long dem;
	
	
	//constructor
	public fraccion(long num,long dem) {
		this.num=num;
		this.dem=dem;
		
	}
	
	
	//getter
	public  long getNum(){
		return this.num;
	}
	
	public long getDem(){
		return this.dem;
	}
	
	
	
	//setter
	
	public static boolean esPrimo(int x) {
		for (int i = 2; i < i-2; i++) {
				if ((x % i) == 0) {
					return false;
				}	
			
		}
		return true;
		
	}
		
	
	public static int[]arrayPrimos(){
		int x=2;
		
		int arrayPrimos[]=new int[50];
	
		for(int i=0;i<50;i++) {
			if(esPrimo(x)==true) {
				arrayPrimos[i]=x;
				x++;
				
			}else
				x++;
				i--;
		}
		return arrayPrimos;
	}
	
	
	
	
	//metodos de instancias
	public void invertir(long num,long dem) {
		System.out.println("Fraccion invertida: "+dem+"/"+num);
		
	}
		
	public void mostrarSimplifica(long num, long dem){
		
		num=numerador.simplifica(num,arrayPrimos());
		dem=denominador.simplifica(dem,arrayPrimos());
		
		System.out.println("La fraccion simplificada es: "+num+"/"+dem);
		
		
	}
	
	
	public static void imprimirArrayPrimos (){
		int[] resultado=new int[50];
		
        for(int i=0;i<50;i++){
            resultado[i]=arrayPrimos()[i];
        }
        
        for(int i=0;i<50;i++){
           System.out.printf("%4s",+resultado[i]);
        }
    }
	
	public void mostrarSuma(long num, long dem, long num2, long dem2) {
		
	
	}
	
	
	public void mostrarDemComun(long num, long dem, long num2, long dem2) {
		dem=denominador.demComun(dem,dem2,arrayPrimos());
		
		System.out.println("La suma de las fracciones es: "+num+"/"+dem);
	}
	
}
	
	
	
	
	
