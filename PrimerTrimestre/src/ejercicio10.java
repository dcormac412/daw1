
public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * double d=Math.random()*100; System.out.println(d);
		 * 
		 * boolean rango1 = (d>=0 && d <20);
		 * System.out.println("El número esta entre 0 y 20? " + rango1);
		 * 
		 * boolean rango2 = (d>=20 && d <=50);
		 * System.out.println("El número esta entre 20 y 50? " + rango2);
		 * 
		 * boolean rango3= (d>50 && d<75);
		 * System.out.println("El número esta entre 50 y 75? " + rango3);
		 * 
		 * boolean rango4= (d>=75 && d<=100);
		 * System.out.println("El número esta entre 75 y 100? " + rango4);
		 */
		
		//Hacer act con operador condicional
		
		
		double num = Math.random()*100;
		System.out.println(num);
		
		String msg = (num >= 0 && num < 20) ?
				"El número está entre 0 y 20, 20 no incluido":
					"El número NO está entre 0 y 20, 20 no incluido";
		
		System.out.println(msg);
		
		msg = (num >= 20 && num < 50) ?
				"El número está entre 20 y 50, 50 no incluido":
					"El número NO está entre 20 y 50, 50 no incluido";
		
		System.out.println(msg);
		
		msg = (num >= 50 && num < 75) ?
				"El número está entre 50 y 75, 75 no incluido":
					"El número NO está entre 0 y 20, 20 no incluido";
		
		System.out.println(msg);
		
		msg = (num >= 75 && num < 100) ?
				"El número está entre 75 y 100, 100 no incluido":
					"El número NO está entre 75 y 100, 100 no incluido";
		
		System.out.println(msg);
		
		
	}

}
