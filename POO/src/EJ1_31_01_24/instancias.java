package EJ1_31_01_24;

public class instancias {
	private static int instanciasCreadas;
	
	public instancias() {
		instanciasCreadas++;
	}

	public static int getInstanciasCreadas() {
		return instanciasCreadas;
	}

	/*public static void setInstanciasCreadas(int instanciasCreadas) {
		instancias.instanciasCreadas = instanciasCreadas;
	}*/
	
}
