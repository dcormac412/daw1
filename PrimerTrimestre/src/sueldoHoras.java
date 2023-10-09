import java.util.Scanner;

public class sueldoHoras {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que calcule el salario semanal de un
		 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
		 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
		 * euros
		 * la hora.
		 * Ejemplo 1:
		 * Por favor, introduzca el número de horas trabajadas durante la semana: 36
		 * El sueldo semanal que le corresponde es de 432 euros
		 * Ejemplo 2:
		 * Por favor, introduzca el número de horas trabajadas durante la semana: 40
		 * El sueldo semanal que le corresponde es de 480 euros
		 * Ejemplo 3:
		 * Por favor, introduzca el número de horas trabajadas durante la semana: 55
		 * El sueldo semanal que le corresponde es de 720 euros
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana: ");
		int horasTrabajadas = scan.nextInt();
		
		scan.close();
		
		//variables o contantes
		
		int salario;
		int horaNormal=12;
		int horasExtra=16;
		
		
		if(horasTrabajadas <=40) {
			salario=horasTrabajadas*horaNormal;
			
			
		} else {
			
			salario=40*horaNormal + (horasTrabajadas-40)*horasExtra;
		}
		
		System.out.println("El salario semanal de la persona es: " + salario + " euros ");
		
		

	}

}
