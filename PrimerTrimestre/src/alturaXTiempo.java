import java.util.Scanner;

public class alturaXTiempo {

	public static void main(String[] args) {
		// Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
		// una altura h. Aplica la fórmula
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la altura desde la que cae el objeto: ");
		
		float h = scan.nextFloat();
		scan.close();
		final float G = 9.81f;
		double t = Math.sqrt((2 * h)/G);
		System.out.println("El objeto tardará en caer " + t + " segundos");
	}

}
