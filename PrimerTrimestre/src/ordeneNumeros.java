import java.util.Scanner;

public class ordeneNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce el número a");
		int a = scan.nextInt();
		

		System.out.println("Introduce el número b");
		int b = scan.nextInt();
		
		System.out.println("Introduce el número c");
		int c = scan.nextInt();
		
		scan.close();
		
		if(a>=b) {
			if (a>=c){
				System.out.println("a es el mayor");
			}
		}else {
			
			
		}
		
		if(b>=a) {
			if (b>=c){
				System.out.println("b es el mayor");
			}
		}else {
			
		}
		
		if(c>=b) {
			if (c>=a){
				System.out.println("c es el mayor");
			}
		}else {
			
		}
		
		if(a<=b) {
			if (a<=c){
				System.out.println("a es el menor");
			}
		}else {
			
			
		}
		
		if(b<=a) {
			if (b<=c){
				System.out.println("b es el menor");
			}
		}else {
			
		}
		
		if(c<=b) {
			if (c<=a){
				System.out.println("c es el menor");
			}
		}else {
			
		}
		
		if(a<=b) {
			if (a>=c){
				System.out.println("a es el mediano");
			}
		}else {
			
			
		}
		
		if(b<=a) {
			if (b>=c){
				System.out.println("b es el mediano");
			}
		}else {
			
		}
		
		if(c>=b) {
			if (c<=a){
				System.out.println("c es el mediano");
			}
		}else {
			
		}
	}

}
