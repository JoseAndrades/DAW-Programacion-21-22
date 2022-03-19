package matematicas;

public class conversorBinarios {
	
	
	public static void reset() {
		
	}
	
	
	//Conversor Decimal a ......
	
	
		//binario
		public static String dec_bin(Long dec) {
			String num="";
	    
			while(dec>0) {
				num=(dec%2)+num;
				dec/=2;  
			}
			return num;
		}
		
		//octal
		public static String dec_oct(int dec2) {
		    String oct = "";// Almacenamos el número octal que será el resultado
		    String caracteresOctales = "01234567";
		    while (dec2 > 0) {
		        int residuo = dec2 % 8;
		        // El residuo es lo que se suma, y podemos usarlo como índice
		        // Recordemos que el carácter se pone "a la izquierda", por eso
		        // concatenamos el carácter y luego lo que ya lleva sumado el octal
		        oct = (caracteresOctales.charAt(residuo) + oct);
		        // Lo vamos dividiendo entre 8 para que en algún momento llegue a 0
		        dec2 /= 8;
		    }
		    return oct;
		}
		
		
		//hexadecimal
	
		public static String dec_hex(int dec3) {
			char digH[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	        String resultado = "";
	        int resto, aux = dec3;
	         
	        while(aux>0){
	            resto = aux % 16;
	            resultado = digH[resto] + resultado;
	            aux /= 16; 
	        }
			return resultado;
		}
	
	
	//Conversor de Binario a.....
		
		//decimal
		
		public static int bin_dec(String bin) {
	        int resultado=Integer.parseInt(bin,2);  
	         
	        return resultado;
		}
		
		//hexadecimal
		
		
		//octal
	
		
		
		
	//Conversor de Hexadecimal a .....
		
		//decimal
		
		
		/*binario
		public static String hex_bin(String hex2) {
			 int numHex = Integer.parseInt(hex2, 16);
		     String binary = Integer.toBinaryString(hex2);
		     return binary;
		}
		*/
		//octal
		
		
		
		
	
	//Conversor de Octal a....
	
		//decimal
		
		//binario
		
		//hexadecimal
		
	
	
	
}
