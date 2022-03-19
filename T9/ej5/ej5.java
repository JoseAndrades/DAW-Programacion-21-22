package ej5;

/*Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es “pedida”. El
siguiente código del programa principal debe dar la salida que se muestra:*/

public class ej5 {
	public static void main(String[] args) {
		
		pizza p1 = new pizza("margarita", "mediana");
		pizza p2 = new pizza("funghi", "familiar");
		p2.sirve();
		pizza p3 = new pizza("cuatro quesos", "mediana");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p2.sirve();
		System.out.println("pedidas: " + pizza.getTotalPedidas());
		System.out.println("servidas: " + pizza.getTotalServidas());
		
		
	}
		
}
