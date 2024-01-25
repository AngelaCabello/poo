package EJ3_23_01_24;

public class Sist_calificaciones {
	
	private String nombreCurso;
	private int calificacion;
	
	public Sist_calificaciones() {
		nombreCurso="matematicas";
		calificacion=9;
	}
		public String dime_nombreCurso() { //getter
			return "el curso se llama el " + nombreCurso;
		}
		public void establece_nombreCurso(String nombreCurso) { //setter
			this.nombreCurso = nombreCurso;
		}
		public int dime_calificacion() {
			return calificacion;
		}
		public void establece_calificacion(int calificacion) {
			this.calificacion=calificacion;
		}
}
