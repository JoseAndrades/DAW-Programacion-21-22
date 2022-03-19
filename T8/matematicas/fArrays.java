package matematicas;
import java.util.Scanner;


public class fArrays {
	static Scanner leer = new Scanner(System.in);
	
	
	
	//EJ 20 generaArrayInt: Genera un array de tamaño n con números aleatorio cuyo intervalo (mínimo y máximo) se indica como parámetro
	
		public static int[] generarArrayInt() {
			int num=20;int max=9;int min=0;
			int resultado [] = new int [num];
	
			//rellenamos el array
			for(int i=0; i<resultado.length; i++) {
				resultado[i]=(int)(Math.random()*(max-min));
			}
			return resultado;
		}
		
		
		
		public static void mostrarGenerarArrayInt() {
			int num=20;
			//lo mostramos
			System.out.println("Array generado:");
			for(int i=0; i<num; i++) {
				System.out.printf("%4d",generarArrayInt()[i]);
			}
			
		}
		
		
		
		
	//EJ 21 minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
		
		public static int minimoArrayInt(int[] array) {
			int resultado; int min=999999;
			
			for(int i=0; i<array.length;i++) {
				if(array[i]<min) {
					min=array[i];
				}
			}
			
			resultado=min;
			return resultado;
		}
		
		public static void mostrarMinimoArrayInt() {
			int array[];
			array=generarArrayInt();
			
		    System.out.println("Array generado:");
			for(int i=0; i<array.length; i++) {
				System.out.printf("%4d",array[i]);
			}		
			System.out.println();
			System.out.println();
			System.out.print("El min del array es:"+minimoArrayInt(array));
		}
		
		
		
		//EJ 22 maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro
		
		public static int maximoArrayInt(int[] array) {
			int resultado; int max=0;
			
			for(int i=0; i<array.length;i++) {
				if(array[i]>max) {
					max=array[i];
				}
			}
			
			resultado=max;
			return resultado;
		}
		
		public static void mostrarMaximoArrayInt() {
			int array[];
			array=generarArrayInt();
			
		    System.out.println("Array generado:");
			for(int i=0; i<array.length; i++) {
				System.out.printf("%4d",array[i]);
			}		
			System.out.println();
			System.out.println();
			System.out.print("El max del array es:"+maximoArrayInt(array));
		}
		
		
		
		//EJ 23 mediaArrayInt: Devuelve la media del array que se pasa como parámetro
		
		
		public static int mediaArrayInt(int[] array) {
			int resultado; int media=0; int cont=0;
			
			for(int i=0; i<array.length;i++) {
				media=array[i]+media;
				cont++;
			}
			resultado=media/cont;
			
			return resultado;
		}
		
		
		public static void mostrarMediaArrayInt() {
			int array[];
			array=generarArrayInt();
			
		    System.out.println("Array generado:");
			for(int i=0; i<array.length; i++) {
				System.out.printf("%4d",array[i]);
			}		
			System.out.println();
			System.out.println();
			System.out.print("La media del array es:"+mediaArrayInt(array));
		}
		
		
		
		//EJ 24 estaEnArrayInt: Dice si un número está o no dentro de un array.
		
		public static boolean estaEnArrayInt(int[]array,int num) {
			for(int i=0; i<array.length;i++) {
				if(array[i]==num) {
					return true;
				}
			}
			return false;
		}
		
		
		public static void mostrarEstaEnArrayInt(int num) {
			int array[];
			array=generarArrayInt();
			
		    System.out.println("Array generado:");
			for(int i=0; i<array.length; i++) {
				System.out.printf("%4d",array[i]);
			}		
			System.out.println();
			System.out.println();
			if(estaEnArrayInt(array,num)==true) {
				System.out.println("El array contiene el num "+num);
			}else
				System.out.println("El array no contiene el num "+num);
		}
		
		
		
		//EJ 22 posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra
		
		public static String posicionEnArray(int[]array,int num) {
			String resultado=" ";
			for(int i=0;i<array.length;i++) {
				if(array[i]==num) {
					resultado= resultado +i+"º, ";
				}
			}
			return resultado;
		}
		
		public static void mostrarPosicionEnArray(int num) {
			int array[];
			array=generarArrayInt();
			
		    System.out.println("Array generado:");
			for(int i=0; i<array.length; i++) {
				System.out.printf("%4d",array[i]);
			}		
			System.out.println();
			if(posicionEnArray(array,num).equals(" ")) {
				System.out.print("El numero "+num+" no está en el array");
			}else
			System.out.print("El numero "+num+" está en la posicion: "+posicionEnArray(array,num));
		
		}
		
		
		
		//EJ 23 volteaArrayInt: Le da la vuelta a un array
		
		public static int[] volteaArrayInt(int[]array) {
			
			int []resultado=new int[10];
			
			return resultado;
			
		}
		
		
		public static void mostrarVolteaArrayInt() {
			int array[];
			array=generarArrayInt();
			int[]volteado=volteaArrayInt(array);
			
		    System.out.println("Array generado:");
			for(int i=0; i<array.length; i++) {
				System.out.printf("%4d",array[i]);
			}		
				System.out.println();
			System.out.println("Array volteado:");
			for(int i=0; i<array.length; i++) {
				System.out.printf("%4d",volteado[i]);
			}
				System.out.println();
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//EJ 29 generaArrayBiInt: Genera un array de tamaño n x m con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
		
		public static int[][] generaArrayBiInt(){
			int x=10; int y=5; int min=0; int max=100;
			int resultado [][] = new int [x][y];
			
			//rellenamos el array
			for(int i=0; i<y; i++) {
				for(int j=0; j<x; j++) {
					resultado[i][j]=(int)(Math.random()*(max-min));
				}
				
			}		
			return resultado;
		}
		
		
		public static void mostrarGeneraArrayBiInt() {
			int x=10; int y=5;
			//lo mostramos
			System.out.println("Array generado:");
			for(int i=0; i<y; i++) {
				for(int j=0; j<x; j++) {
					System.out.print("%4d", generarArrayBiInt()[i][j]+"  ");
				}
				System.out.println();
			}
		}
		
		
		
		
		
}


			
		
		
		
