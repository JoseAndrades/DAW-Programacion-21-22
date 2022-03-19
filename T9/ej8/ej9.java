package ej8;

public class ej9 {
	public static void main(String[]args){
		
		movil m1 = new movil("678 11 22 33", "rata");
		movil m2 = new movil("644 74 44 69", "mono");
		movil m3 = new movil("622 32 89 09", "bisonte");
		System.out.println(m1);
		System.out.println(m2);
		m1.llama(m2, 320);
		m1.llama(m3, 200);
		m2.llama(m3, 550);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
	}
}
