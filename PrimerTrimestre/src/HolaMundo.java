import java.util.Scanner;
/**
 * 
 */

/**
 * 
 */
public class HolaMundo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor:");
		String miNombre = scan.nextLine(); //para leer datos
		
		System.out.println("Introduce tu edad, por favor");
		int edad = scan.nextInt();
		
		System.out.println("¿Qué estas estudiando?");
		scan.nextLine();
		String estudios = scan.nextLine();
		
		System.out.println("Bienvenido " + miNombre + ", tu edad es " + edad + " y estas estudiando " + estudios + ".");
		
		scan.close();
		
		
		
	}

}
