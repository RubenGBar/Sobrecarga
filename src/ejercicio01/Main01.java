package ejercicio01;

import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		
		int num1, num2, resultado;
		
		double numDecimal1, numDecimal2, resultadoDecimal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduzca otro n�mero: ");
		num2 = sc.nextInt();
		
		resultado = Funciones01.suma(num1, num2);
		
		
		
		System.out.println("Introduzca un n�mero decimal: ");
		numDecimal1 = sc.nextDouble();
		
		System.out.println("Introduzca otro n�mero decimal: ");
		numDecimal2 = sc.nextDouble();
		
		resultadoDecimal = Funciones01.suma(numDecimal1, numDecimal2);
		
		
		
		System.out.println("La suma de los n�meros enteros es: " + resultado);
		System.out.println("La suma de los n�meros decimales es: " + resultadoDecimal);
		
		sc.close();
	}

}
