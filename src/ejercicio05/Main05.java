package ejercicio05;

import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		
		int aleatorioBinario, cant1, max1, cant2, min, max2;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("GENERAR NÚMEROS ENTRE 0 Y 1");
		
		System.out.println("Introduzca un número para generar esa cantidad de números aleatorios entre 0 y 1: ");
		aleatorioBinario = sc.nextInt();
		
		Funciones05.numerosAleatoriosBinarios(aleatorioBinario);
		
		System.out.println("----------------------------------------------------------------------------------");
		
		
		System.out.println("GENERAR NÚMEROS ALEATORIOS ENTRWE 0 (SIN ICNLUIR) Y UN NÚMERO MÁXIMO (SIN ICNLUIR)");
		
		System.out.println("Introduzca una cantidad de números aleatorios a generar: ");
		cant1 = sc.nextInt();
		
		System.out.println("Introduzca el número máximo (sin incluir) para esos números aleatorios: ");
		max1 = sc.nextInt();
		
		Funciones05.numerosAleatoriosMax(cant1, max1);
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
		
		System.out.println("GENERAR NÚMEROS ALEATORIOS ENTRE UN NÚMERO MÍNIMO (SIN ICNLUIR) Y UN NÚMERO MÁXIMO (SIN ICNLUIR)");
		
		System.out.println("Introduzca una cantidad de números aleatorios a generar: ");
		cant2 = sc.nextInt();
		
		System.out.println("Introduzca el número mínimo (sin incluir) para esos números aleatorios: ");
		min = sc.nextInt();
		
		System.out.println("Introduzca el número máximo (sin incluir) para esos números aleatorios: ");
		max2 = sc.nextInt();
		
		Funciones05.numerosAleatoriosMaxyMin(cant2, max2, min);
		
		sc.close();
		
	}

}
