package EJ1_23_01_24;

public class Reg_Estudiantes {
	
	private String nombre;
	private int edad;
	private int grado;
	
	public Reg_Estudiantes(){
		nombre = "Amanda";
		edad = 24;
		grado = 5;
	}
		public String dime_nombre() { //getter
			return "el nombre del estudiante es " + nombre;
		}
		public void establece_nombre(String nombre) { //setter
			this.nombre = nombre;
		}
		public String dime_edad() {
			return "la edad de " + nombre + " es " + edad +" años";
		}
		public void establece_edad(int edad) {
			this.edad = edad;
		}
		public String dime_grado() {
			return "el grado del estudiante es " + grado;
		}
		public void establece_grado(int grado) {
			this.grado = grado;
		}
}
