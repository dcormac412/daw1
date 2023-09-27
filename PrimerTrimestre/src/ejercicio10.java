
public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=Math.random()*100;
		System.out.println(d);
		
		boolean rango1 = (d>=0 && d <20);
		System.out.println("El número esta entre 0 y 20? " + rango1);
		
		boolean rango2 = (d>=20 && d <=50);
		System.out.println("El número esta entre 20 y 50? " + rango2);
		
		boolean rango3= (d>50 && d<75);
		System.out.println("El número esta entre 50 y 75? " + rango3);
		
		boolean rango4= (d>=75 && d<=100);
		System.out.println("El número esta entre 75 y 100? " + rango4);

	}

}
