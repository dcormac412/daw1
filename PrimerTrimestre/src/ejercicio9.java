import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
	/*double baseImponible=110;
	double tasaIVA=baseImponible*0.21;
	
	double totalFactura=baseImponible+tasaIVA;
	
	System.out.println("El total de la factura es: " + totalFactura + " €");
	}*/
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduce la base imponible:");
	double base = entrada.nextDouble();
	double iva = 0.21;
	double totalFactura = base + iva;
	System.out.println(totalFactura);
	
	}
}
