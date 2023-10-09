/**
 * 
 */

import java.util.Scanner;

import javax.swing.SwingConstants;

/**
 * 
 */
public class notaMedia {

	/**
	  	Realiza un programa que cálcule la nota de un examen de tipo test.
		Para calcular la nota final tienes que tener en cuenta que cada error restará
    	la mitad de un acierto,
 		y que obviamente las preguntas sin contestar ni restarán ni sumarán.
 		La nota final se calculará de 0 a 10 con la fórmula indicada.

		Después de realizar el paso anterior haz que el programa muestre la calificación no numérica de dicho examen:

		Si la nota es menor de 5, la calificación será "INSUFICIENTE".
		Si la nota es mayor o igual a 5 y menor que 7, la calificación será "SUFICIENTE".
		Si la nota es mayor o igual a 7 y menor que 9, entonces la calificación será "NOTABLE".
    	Si la nota es mayor o igual a 9 y menor o igual a 10, entonces la califación será de "SOBRESALIENTE".
		Para realizar este ejercicio deberás combinar las estructuras condicionales aprendidas en este apartado.
		
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el número de preguntas: ");
		int pre = scan.nextInt();
		
		System.out.println("Introduce el número de aciertos: ");
		int aciertos = scan.nextInt();
		
		System.out.println("Introduce el número de errores: ");
		int errores = scan.nextInt();
		
		scan.close();
		
		//Declarar las variables
		
		float nota = 0f;
		int notaEntera = 0;
		String calificacion = "";
		
		//establecer condicion valida
		
		if(pre<aciertos+errores) {
			System.out.println("Los datos introducidos no son válidos");
		} else {
		
		//como calcular la nota 
		
		nota = ((aciertos-(errores / 2f))*10f) / pre;
		
		//pasar resultado a entero
		
		notaEntera = (int)Math.round(nota);
		
		//realizar swich con sus notas
		
		switch(notaEntera) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				calificacion = "Insuficiente";
				break;
				
			case 5:
			case 6:
				calificacion="Suficiente";
				break;
				
			case 7:
			case 8:
				calificacion="Notable";
				break;
				
			case 9:
			case 10:
				calificacion="Sobresaliente";
				break;
				
			default:
				//System.out.println("No cumple los criterios de evaluación");
				calificacion = "Numero no válido";
				
		}
		
		System.out.println("La nota obtenida es: " + nota);
		System.out.println("Y la calificación obtenida es: " + calificacion);
		
		}
	}

}
