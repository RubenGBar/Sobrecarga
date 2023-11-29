package ejercicio03;

public class Funciones03 {
	public static int sumaEnteros(int numero) {
		int suma = 0;
		
		for(int i = 1; i <= numero; i++) {
			suma += i;
		}
		
		return suma;
	}

	public static int sumaEnteros(int num1, int num2) {
		int suma = 0;
		
		for(int i = num1; i <= num2; i++) {
			suma += i;
		}
		
		return suma;
	}
}
