import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  double equiv = 1.06; double euro = 220; double conversion = euro*equiv;
		  System.out.println(euro + " € equivalen a " + conversion + " $ ");
		 */
		
		//Introduciendo valores por teclado
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el número de euros (€): ");
		double euros = scanner.nextDouble();
		
		System.out.println("Introduce el cambio actual de dólares ($) a euros (€): ");
		double equiv = scanner.nextDouble();
		
		double conversion = euros * equiv;
		System.out.println(euros + "€ equivalen a " + conversion + "$");
		scanner.close();
		
		
	}

}
