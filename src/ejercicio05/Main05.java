package ejercicio05;

import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		
		int aleatorioBinario, cant1, max1, cant2, min, max2;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("GENERAR N�MEROS ENTRE 0 Y 1");
		
		System.out.println("Introduzca un n�mero para generar esa cantidad de n�meros aleatorios entre 0 y 1: ");
		aleatorioBinario = sc.nextInt();
		
		Funciones05.numerosAleatoriosBinarios(aleatorioBinario);
		
		System.out.println("----------------------------------------------------------------------------------");
		
		
		System.out.println("GENERAR N�MEROS ALEATORIOS ENTRWE 0 (SIN ICNLUIR) Y UN N�MERO M�XIMO (SIN ICNLUIR)");
		
		System.out.println("Introduzca una cantidad de n�meros aleatorios a generar: ");
		cant1 = sc.nextInt();
		
		System.out.println("Introduzca el n�mero m�ximo (sin incluir) para esos n�meros aleatorios: ");
		max1 = sc.nextInt();
		
		Funciones05.numerosAleatoriosMax(cant1, max1);
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
		
		System.out.println("GENERAR N�MEROS ALEATORIOS ENTRE UN N�MERO M�NIMO (SIN ICNLUIR) Y UN N�MERO M�XIMO (SIN ICNLUIR)");
		
		System.out.println("Introduzca una cantidad de n�meros aleatorios a generar: ");
		cant2 = sc.nextInt();
		
		System.out.println("Introduzca el n�mero m�nimo (sin incluir) para esos n�meros aleatorios: ");
		min = sc.nextInt();
		
		System.out.println("Introduzca el n�mero m�ximo (sin incluir) para esos n�meros aleatorios: ");
		max2 = sc.nextInt();
		
		Funciones05.numerosAleatoriosMaxyMin(cant2, max2, min);
		
		sc.close();
		
	}

}
