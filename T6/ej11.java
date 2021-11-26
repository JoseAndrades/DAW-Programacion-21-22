/*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
*la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número
*de suspensos, el número de suficientes, el número de bienes, etc
*/

public class ej11 {
	public static void main(String[] args) {
		
		int aleatorio=0;
		int contsusp=0;
		int contsuf=0;
		int contbn=0;
		int contnot=0;
		int contsob=0;
		String nota="";
		
		for(int i=0; i<20;i++) {
			aleatorio=(int)(Math.random()*11);
			
			switch(aleatorio) {
				case 0,1,2,3,4:
					nota = "Suspenso";
					contsusp++;
					System.out.println((i+1)+"- Ha sacado un "+aleatorio+" - "+nota);
					break;
				case 5:
					nota = "Suficiente";
					contsuf++;
					System.out.println((i+1)+"- Ha sacado un "+aleatorio+" - "+nota);
					break;
				case 6:
					nota = "Bien";
					contbn++;
					System.out.println((i+1)+"- Ha sacado un "+aleatorio+" - "+nota);
					break;
				case 7,8:
					nota = "Notable";
					System.out.println((i+1)+"- Ha sacado un "+aleatorio+" - "+nota);
					contnot++;
					break;
				case 9,10:
					nota = "Sobresaliente";
					System.out.println((i+1)+"- Ha sacado un "+aleatorio+" - "+nota);
					contsob++;
					break;
				
			}
		}
		System.out.println();
		System.out.print("Han habido "+contsusp+" suspensos, "+contsuf+" suficientes, "+contbn+" bien, "+contnot+" notables y "+contsob+" sobresalientes. ");
		
	}
}
