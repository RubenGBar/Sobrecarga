package ejercicio03;

import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		
		int numero, num1, num2, suma1, suma2;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		
		System.out.println("Introduzca un segundo número: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduzca un tercer número: ");
		num2 = sc.nextInt();
		
		if (num1 > num2) System.out.println("El segundo número debe de ser menor que el tercero");;
		
		}while(num1 > num2);
		
		
		suma1 = Funciones03.sumaEnteros(numero);
		suma2 = Funciones03.sumaEnteros(num1, num2);
		
		
		System.out.println("La suma desde 1 hasta " + numero + " es: " + suma1);
		System.out.println("La suma desde " + num1 + " hasta " + num2 + " es: " + suma2);
		
		sc.close();
		
	}

}
