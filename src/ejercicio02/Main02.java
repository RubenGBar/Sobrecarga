package ejercicio02;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		double resultado1, resultado2;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduzca un número: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduzca otro número: ");
		num2 = sc.nextInt();
		
		System.out.println("Introduzca otro número: ");
		num3 = sc.nextInt();
		
		
		resultado1 = Funciones02.media(num1, num2);
		resultado2 = Funciones02.media(num1, num2, num3);
		
		
		System.out.println("La media de los 2 primeros números es: " + resultado1);
		System.out.println("La media de los 3 números es: " + resultado2);
		
		sc.close();
		
	}

}
