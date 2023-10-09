import java.util.Scanner;

public class introduce3numOrdenados {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el primer número entero: ");
		int num1=scan.nextInt();
		
		System.out.println("Introduce el segundo número entero: ");
		int num2=scan.nextInt();
		
		
		System.out.println("Introduce el tercer número entero: ");
		int num3=scan.nextInt();
		
		scan.close();
		
		if(num1>num2 && num1>num3) {
			System.out.println("El número mayor es: " + num1);
			
			if(num2>num1 && num2>num3) {
				System.out.println("El número mayor es: " + num2);
			}
			
		}else {
			System.out.println("El numero mayor es: " + num3);
		}


	}

}
