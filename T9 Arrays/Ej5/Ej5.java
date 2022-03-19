package Ej5;
import java.util.Scanner;


/*Crea el programa GESTISIMAL (GESTI�n SIMplificada de Almac�n) para llevar el
control de los art�culos de un almac�n. De cada art�culo se debe saber el c�digo,
la descripci�n, el precio de compra, el precio de venta y el stock (n�mero de
unidades). El men� del programa debe tener, al menos, las siguientes opciones:
*/


public class Ej5 {
	// N determina el tama�o del array
		static int N = 100;

		public static void main(String[] args) {
			int opcion;
			int primeraLibre;
			Scanner s = new Scanner(System.in);

			int i;
			int stockIntroducido;
			double precioDeCompraIntroducido;
			double precioDeVentaIntroducido;
			String codigo;
			String codigoIntroducido = "";
			String descripcionIntroducida;
			String precioDeCompraIntroducidoString;
			String precioDeVentaIntroducidoString;
			String stockIntroducidoString;
			boolean existeCodigo;
			
			
	//Crea el array de art�culos
			Articulo[] articulo = new Articulo[N];
	// Crea todos los art�culos que van en cada una de
	// las celdas del array
			for (i = 0; i < N; i++) {
				articulo[i] = new Articulo();
			}
	// Menu
			do {
				System.out.println("\n\nG E S T I S I M A L");
				System.out.println("===================");
				System.out.println("1. Listado");
				System.out.println("2. Alta");
				System.out.println("3. Baja");
				System.out.println("4. Modificaci�n");
				System.out.println("5. Entrada de mercanc�a");
				System.out.println("6. Salida de mercanc�a");
				System.out.println("7. Salir");
				System.out.print("Introduzca una opci�n: ");
				opcion = s.nextInt();
				switch (opcion) {
	/////////////////////////////////////////////////////////////////////////////
	// LISTADO //////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
				case 1:
					System.out.println("\nLISTADO");
					System.out.println("=======");
					for (i = 0; i < N; i++) {

						if (!articulo[i].getCodigo().equals("LIBRE")) {
							System.out.println(articulo[i]);
						}
					}
					break;
	/////////////////////////////////////////////////////////////////////////////
	// ALTA /////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
				case 2:
					System.out.println("\nNUEVO ART�CULO");
					System.out.println("==============");
	// Busca la primera posici�n libre del array
					primeraLibre = 0;
					codigo = articulo[primeraLibre].getCodigo();
					while ((primeraLibre < N) && (!(codigo.equals("LIBRE")))) {
						primeraLibre++;
						if (primeraLibre < N) {
							codigo = articulo[primeraLibre].getCodigo();
						}
					}
					if (primeraLibre == N) {
						System.out.println("Lo siento, a base de datos est� llena.");
					} else {
	// Introducci�n de datos
						System.out.println("Por favor, introduzca los datos del art�culo.");
						System.out.print("C�digo: ");
	// Comprueba que el c�digo introducido no se repita
						existeCodigo = true;
						while (existeCodigo) {
							existeCodigo = false;
							codigoIntroducido = s.next();
							for (i = 0; i < N; i++) {
								if (codigoIntroducido.equals(articulo[i].getCodigo())) {
									existeCodigo = true;
								}
							}

							if (existeCodigo) {
								System.out.println("Ese c�digo ya existe en la base de datos.");
								System.out.print("Introduzca otro c�digo: ");
							}
						} // while (existeCodigo)
						articulo[primeraLibre].setCodigo(codigoIntroducido);
						System.out.print("Nombre: ");
						descripcionIntroducida = s.next();
						articulo[primeraLibre].setDescripcion(descripcionIntroducida);
						System.out.print("Precio de compra: ");
						precioDeCompraIntroducido = Double.parseDouble(s.next());
						articulo[primeraLibre].setPrecioCompra(precioDeCompraIntroducido);
						System.out.print("Precio de venta: ");
						precioDeVentaIntroducido = Double.parseDouble(s.next());
						articulo[primeraLibre].setPrecioVenta(precioDeVentaIntroducido);
						System.out.print("Stock: ");
						stockIntroducido = Integer.parseInt(s.next());
						articulo[primeraLibre].setStock(stockIntroducido);
					}
					break;
	/////////////////////////////////////////////////////////////////////////////
	// BAJA /////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
				case 3:
					System.out.println("\nBAJA");
					System.out.println("====");
					System.out.print("Por favor, introduzca el c�digo del art�culo que desea dar de baja: ");
					codigoIntroducido = s.next();
					i = -1;
					codigo = "";
					do {
						i++;
						if (i < N) {
							codigo = articulo[i].getCodigo();
						}

					} while (!(codigo.equals(codigoIntroducido)) && (i < N));
					if (i == N) {
						System.out.println("Lo siento, el c�digo introducido no existe.");
					} else {
						articulo[i].setCodigo("LIBRE");
						System.out.println("articulo borrado.");
					}
					break;
	/////////////////////////////////////////////////////////////////////////////
	// MODIFICACI�N /////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
				case 4:
					System.out.println("\nMODIFICACI�N");
					System.out.println("============");
					System.out.print("Por favor, introduzca el c�digo del art�culo cuyos datos desea cambiar: ");
					codigoIntroducido = s.next();
					i = -1;
					do {
						i++;
					} while (!((articulo[i].getCodigo()).equals(codigoIntroducido)));
					System.out.println("Introduzca los nuevos datos del art�culo o INTRO para dejarlos igual.");
					System.out.println("C�digo: " + articulo[i].getCodigo());
					System.out.print("Nuevo c�digo: ");
					codigoIntroducido = s.next();
					if (!codigoIntroducido.equals("")) {
						articulo[i].setCodigo(codigoIntroducido);
					}
					System.out.println("Descripci�n: " + articulo[i].getDescripcion());
					System.out.print("Nueva descripci�n: ");
					descripcionIntroducida = s.next();
					if (!descripcionIntroducida.equals("")) {
						articulo[i].setDescripcion(descripcionIntroducida);
					}
					System.out.println("Precio de compra: " + articulo[i].getPrecioCompra());
					System.out.print("Nuevo precio de compra: ");
					precioDeCompraIntroducidoString = s.next();
					if (!precioDeCompraIntroducidoString.equals("")) {
						articulo[i].setPrecioCompra(Double.parseDouble(precioDeCompraIntroducidoString));
					}
					System.out.println("Precio de venta: " + articulo[i].getPrecioVenta());
					System.out.print("Nuevo precio de venta: ");
					precioDeVentaIntroducidoString = s.next();
					if (!precioDeVentaIntroducidoString.equals("")) {
						articulo[i].setPrecioVenta(Double.parseDouble(precioDeVentaIntroducidoString));
					}
					System.out.println("Stock: " + articulo[i].getStock());
					System.out.print("Nuevo stock: ");
					stockIntroducidoString = s.next();
					if (!stockIntroducidoString.equals("")) {
						articulo[i].setStock(Integer.parseInt(stockIntroducidoString));
					}
					break;
	/////////////////////////////////////////////////////////////////////////////
	// ENTRADA DE MERCANC�A /////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
				case 5:
					System.out.println("\nENTRADA DE MERCANC�A");
					System.out.println("====================");
					System.out.print("Por favor, introduzca el c�digo del art�culo: ");
					codigoIntroducido = s.next();
					i = -1;
					codigo = "";
					do {
						i++;
						if (i < N) {
							codigo = articulo[i].getCodigo();
						}
					} while (!(codigo.equals(codigoIntroducido)) && (i < N));
					if (i == N) {
						System.out.println("Lo siento, el c�digo introducido no existe.");
					} else {
						System.out.println("Entrada de mercanc�a del siguiente art�culo: ");
						System.out.println(articulo[i]);
						System.out.print("Introduzca el n�mero de unidades que entran al almac�n: ");
						stockIntroducidoString = s.next();
						articulo[i].setStock(Integer.parseInt(stockIntroducidoString) + articulo[i].getStock());
						System.out.println("La mercanc�a ha entrado en el almac�n.");
					}
					break;
	/////////////////////////////////////////////////////////////////////////////
	// SALIDA DE MERCANC�A //////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
				case 6:
					System.out.println("\nSALIDA DE MERCANC�A");
					System.out.println("===================");
					System.out.print("Por favor, introduzca el c�digo del art�culo: ");
					codigoIntroducido = s.next();
					i = -1;
					codigo = "";
					do {
						i++;
						if (i < N) {
							codigo = articulo[i].getCodigo();
						}
					} while (!(codigo.equals(codigoIntroducido)) && (i < N));
					if (i == N) {
						System.out.println("Lo siento, el c�digo introducido no existe.");
					} else {
						System.out.println("Salida de mercanc�a del siguiente art�culo: ");
						System.out.println(articulo[i]);
						System.out.print("Introduzca el n�mero de unidades que desea sacar del almac�n: ");
						stockIntroducido = Integer.parseInt(s.next());
						if (articulo[i].getStock() - stockIntroducido > 0) {
							articulo[i].setStock(articulo[i].getStock() - stockIntroducido);
							System.out.println("La mercanc�a ha salido del almac�n.");
						} else {
							System.out.println("Lo siento, no se pueden sacar tantas unidades.");
						}
					}
					break;

				} // switch
			} while (opcion != 7);
		}

}
