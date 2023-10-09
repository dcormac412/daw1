import java.util.Scanner;

public class calculaSegundos {

	public static void main(String[] args) {
		
		// Escribe un programa que dada una hora determinada (horas y minutos), calcule
		//los segundos que faltan para llegar a la medianoche
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce las horas");
		int hora = scan.nextInt();
		

		System.out.println("Introduce los minutos");
		int minutos = scan.nextInt();
		
		scan.close();
		
		int seg = 0;
		
		if (hora >=0 && hora <=24 && minutos >=0 && minutos <60) {
			seg = (23-hora)*3600 + (60-minutos)*60;
			
			System.out.println("Los segundos que quedan son: " + seg + " para la medianoche ");
			
			
		}else {
			System.out.println("Hay un error en la introducción de los datos");
		}
		
		


	}

}
