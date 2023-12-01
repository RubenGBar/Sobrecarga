package ejercicio05;

import java.util.Random;

public class Funciones05 {

	static Random rand = new Random();

	public static void numerosAleatoriosBinarios(int aleatorioBinario) {

		for (int i = 1; i <= aleatorioBinario; i++) {

			double randBinario = rand.nextDouble(0, 1);

			System.out.println(randBinario);

		}

	}

	public static void numerosAleatoriosMax(int cant1, int max1) {

		for (int i = 1; i <= cant1; i++) {

			int rand1 = rand.nextInt(0 + 1, max1);

			System.out.println(rand1);
		}

	}

	public static void numerosAleatoriosMaxyMin(int cant2, int max2, int min) {
		
		for (int i = 1; i <= cant2; i++) {

			int rand2 = rand.nextInt(min + 1, max2);

			System.out.println(rand2);
		}
		
	}
	
}
