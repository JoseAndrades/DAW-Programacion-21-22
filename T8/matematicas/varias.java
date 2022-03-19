package matematicas;
import java.lang.Math;

public class varias {
	
	
	//EJ 1 esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
	 
	public static boolean esCapicua(int x) {

		int faltante;
		int numeroInvertido;
		int restante;
		
		faltante=x;
		numeroInvertido=0;
		restante=0;
		
		while(faltante!=0) {
		       
		    restante=faltante%10;
	        numeroInvertido=numeroInvertido*10+restante;
	        faltante=faltante/10;
			
			}
			
		    if(numeroInvertido==x && x>10){
		    	
				 return true;
	        }else
	        	
		    	 return false;
			}
	
	
	public static void mostrarEsCapicua(int x) {
		if(esCapicua(x)==true) {
			System.out.println("El numero es capicua");
		}else
			System.out.println("El numero no es capicua");
		 
	}

	
	
	//EJ 2 esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario
	
	public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
				if ((x % i) == 0) {
					return false;
				}	
		}
		return true;
		
	}
	
	public static void mostrarEsPrimo(int x) {
		if(esPrimo(x)==true) {
			System.out.println("El numero "+x+" es primo");
		}else
			System.out.println("El numero "+x+" no es primo");
	}
	
	
	
	//EJ 3 siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
	
	public static int siguientePrimo(int x) {
		boolean aux=false;
		int resultado=x+1;
		
		do{
			aux = esPrimo(resultado);
			if(aux==false) {
				resultado++;
			}else
			 continue;
		}while(aux==false);
		
		return resultado;
	}
	
	
	public static void mostrarSiguientePrimo(int x) {
		System.out.println("El próximo primo es "+siguientePrimo(x));
	}
	
	
	
	
	//EJ 4 potencia: Dada una base y un exponente devuelve la potencia
	
	public static double potencia(int a,int b) {
		double x= Math.pow(a,b);
		
		return x ;
	}
	
	public static void mostrarPotencia(int a, int b) {
		double x= potencia(a,b);
		
		System.out.println("La potencia da como resultado "+ x);
	}
	
	
	//EJ 5 digitos: Cuenta el número de dígitos de un número entero.

	public static int digitos(int x) {
		
		int longitud = String.valueOf(x).length();
		return longitud;
	}
	
	
	public static void mostrarDigitos(int x) {
		int longitud=digitos(x);
		System.out.println("El numero "+x+" tiene "+longitud+" cifras");
	}
	
	
	
	//EJ 6 voltea: Le da la vuelta a un número
	public static long voltea(long x) {
		long resultado = 0;
		if (x < 0) {
			return -voltea(-x);
		}
		
		while(x > 0) {
			resultado = (resultado * 10) + (x % 10);
			x = x / 10;
		}
		return resultado;
	}
	
	
     public static void mostrarVoltea(long x) {
    	 System.out.print("El numero volteado es "+voltea(x));
     }
			
		
	
     
     //EJ 7 digitoN: Devuelve el dígito que está en la posición n de un número entero.Se empieza contando por el 0 y de izquierda a derecha.
     
     public static int digitoN(long num, int cif) {
    	 int resultado=0;
    	 String Snum = String.valueOf(num);
    	 	resultado = Character.digit(Snum.charAt(cif), 10);
    	 
    	 return resultado;
     }
     
     public static void mostrarDigitoN(long num, int cif) {
    	 System.out.print("El digito en la posición "+cif+"º es el "+digitoN(num,cif));
     }

	
     
     //EJ 8 posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
     
     public static int posicionDeDigito(long num, int dig) {
    	 int resultado=0;
    	
  
    	 int longitud = String.valueOf(num).length();
    	 
    	 for(int i=0; i<longitud; i++) {
    		  if(digitoN(num,i)==dig){
    			  resultado=digitoN(num,i);
    			  break;
    		 }else
    			 continue;
    	 }
    	 return resultado;
     }
     
     public static void mostrarPosicionDeDigito(long num, int dig) {
    	 System.out.print("El primer "+dig+" del numero "+num+" se encuentra en la "+posicionDeDigito(num,dig)+"º posicion");
     }
     
	
     
     

	//EJ 9 quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).

	public static long quitaPorDetras(int num, int dig) {
		int resultado=0;
		
		
		return resultado;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}