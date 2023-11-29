package ejercicio04;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		
		int binario;
		
		String condicional = "";
		
		boolean resultadoBinario, resultadoCondicional;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduzca 0 o 1: ");
			binario = sc.nextInt();
			
			System.out.println("Introduzca 'false' o 'true': ");
			condicional = sc.next();
			
			if (binario > 1 || binario < 0 || !condicional.equals("true") || !condicional.equals("false")) 
				System.out.println("Debe introducir un valor númerico entre 1 y 0 y/o la palabra debe estar en minúsculas");;
			
		}while(binario > 1 || binario < 0 || !condicional.equals("true") || !condicional.equals("false"));
		
		
		resultadoBinario = Funciones04.parseToBoolean(binario);
		resultadoCondicional = Funciones04.parseToBoolean(condicional);
		
		
		System.out.println(binario + " pasado a un valor de tipo boolean es: " + resultadoBinario);
		System.out.println(condicional + " pasado a un valor de tipo boolean es: " + resultadoCondicional);
		
		sc.close();
		
	}

}
