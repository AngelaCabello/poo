package EJ1_14_02_24;

public class Main {
	 public static void main(String[] args) {
	        Empleado empleado = new Empleado("Roberto", 70000);
	        empleado.setDepartamento("Microinformática");

	        System.out.println("Empleado: " + empleado.getNombre() + " - " + empleado.getSalario() + "€ - " + empleado.getDepartamento());
	    }
}
