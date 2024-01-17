package EJ3_16_01_24;

public class estudiante {
	
	private String nombre;
	private int edad;
	private double calificacion;
	
	public estudiante() {
		nombre="Encarna";
		edad =20;
		calificacion=80.25;
		
	}
	public String dime_nombre() {//getter
		return "su nombre es " + nombre;
	}
	public void establece_nombre() {//setter
		nombre = "encarna";
	}
	public String dime_edad() {//getter
		return "su edad es: " + edad;
	}
	public void establece_edad() {//setter
		edad = 25;
	}
	public String dime_calificacion() {//getter
		return "su nota media es: " + calificacion;
	}
	public void establece_calificacion() {//setter
		calificacion = 80.5;
	}
}
