package EJ2_06_02_24;

public class estudiante extends persona {
	private String carrera;
	
	public estudiante(String nombre,int edad,String carrera) {
		super(nombre, edad);
		this.carrera=carrera;
	}
}
