import java.util.Scanner;

public class ordenarNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el primer número entero: ");
		int num1=scan.nextInt();
		
		System.out.println("Introduce el segundo número entero: ");
		int num2=scan.nextInt();
		
		scan.close();
		
		if(num1>num2) {
			System.out.println("El número mayor es: " + num1);
			
		}else {
			System.out.println("El número mayor es: " + num2);
			
		}
		
		if(num1<num2) {
			System.out.println("El número menor es: " + num1);
			
		}else {
			System.out.println("El número menor es: " + num2);
			
		}

		
	}

}
