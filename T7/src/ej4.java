/*Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas
*/

public class ej4 {
	public static void main(String[] args) {
		
		int[] numero = new int [20];
		int[] cuadrado = new int [20];
		int[] cubo = new int [20];
		
		
		//Llenamos el array numero con los valores aleatorios
		
		for(int i=0; i<numero.length; i++) {
			numero[i]=(int)(Math.random()*100)+1;
		}
		
		//Hacemos el cuadrado del array numero
		
		for(int i=0; i<cuadrado.length; i++) {
			cuadrado[i]=(numero[i]*numero[i]);
		}
		
		//Hacemos el cubo del array numero
		
		for(int i=0; i<cubo.length; i++) {
			cubo[i]=(cuadrado[i]*numero[i]);
		}
				
		//Mostramos los valores
		System.out.printf("%10s %8s %6s","numero","cuadrado","cubo");
		System.out.println();
		for(int i=0; i<numero.length; i++) {
			System.out.printf("%8d %8d %8d",numero[i],cuadrado[i],cubo[i]);
			System.out.println();
		}
				
	}
}
