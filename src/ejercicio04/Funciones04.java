package ejercicio04;

public class Funciones04 {
	public static boolean parseToBoolean(int binario) {
		boolean res = false;
		
		if (binario == 1) res = true;
		
		return res;
	}

	public static boolean parseToBoolean(String condicional) {
		boolean res = false;
		
		if (condicional.equalsIgnoreCase("true")) res = true;
		
		return res;
	}
}
