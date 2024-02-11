package EJ5_31_01_24;

public class contador {
	private static int mensaje;
	
	public contador() {
		
	}
	
	public void impreso() {
		System.out.println("este mensaje esta siendo imprimido");
		mensaje++;
	}
	
	public static int getMensaje() {
		return mensaje;
	}

	/*public static void setMensaje(int mensaje) {
		contador.mensaje = mensaje;
	}*/
	
}
