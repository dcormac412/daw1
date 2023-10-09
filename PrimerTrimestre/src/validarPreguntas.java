import java.util.Scanner;

public class validarPreguntas {
			// Realiza un minicuestionario con 5 preguntas tipo test sobre el módulo de programación.
			//Cada pregunta acertada sumará dos puntos si se acierta y restará un punto si se falla.
			//El programa mostrará al final la calificación obtenida.
			//Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("CUESTIONARIO DE 1º DAW");
		
		System.out.println("1. ¿Cuál es el lenguaje que se utiliza para concatenar cadenas");
	    System.out.println("a) .substring\nb) .concat\nc) .lengh"); 
		
		String respuesta = scan.next();
		
		int puntos = 0;
		
		if(respuesta.equals("b")) {
			puntos+=2;
			System.out.println("Correcto");
			
		}else {
			puntos-=1;
			System.out.println("Incorrecto");
		}
		
		 System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
		 System.out.println("a) int\nb) double\nc) float"); 
		 String respuesta1 = scan.next();
		
		
		 if(respuesta1.equals("b")) {
				puntos+=2;
				System.out.println("Correcto");
				
			}else {
				puntos-=1;
				System.out.println("Incorrecto");
			}
		 
		 System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
		 System.out.println("a) href\nb) a\nc) link"); 
		 String respuesta2=scan.next();
		 
		 if(respuesta2.equals("a")) {
				puntos+=2;
				System.out.println("Correcto");
				
			}else {
				puntos-=1;
				System.out.println("Incorrecto");
			}
		 
		 System.out.println("4. ¿Qué metodo cuenta los caracteres de una cadena");
		 System.out.println("a) .leng  \nb) .lenght \nc) .length");
		 String respuesta4 = scan.next();
		 
		 if(respuesta4.equals("c")) {
			 puntos+=2;
			 System.out.println("Correcto");
		 }else {
			 puntos-=1;
			 System.out.println("Incorrecto");
		 }
		 
		 System.out.println("5. ¿Cómo actua el operador condicional ?:");
		 System.out.println("a) Como un if/else \nb) Como un swich  \nc) no tiene nada que ver con ambos");
		 String respuesta5 = scan.next();
		 
		 if(respuesta5.equals("a")) {
			 puntos+=2;
			 System.out.println("Correcto");
			 
		 }else {
			 puntos-=1;
			 System.out.println("Incorrecto");
		 }
		 
		scan.close();
		
		System.out.println("Tienes " + puntos + " puntos");
	
		
		

		
		
		
	}

}
