package EJ2_19_02_24;

public class Permanente extends Empleado {
	    private double beneficiosAdicionales;
	    public Permanente(String nombre, int id, double salario) {
	        super(nombre, id, salario);
	    }
	    public Permanente(String nombre, int id, double salario, double beneficiosAdicionales) {
	        super(nombre, id, salario);
	        this.beneficiosAdicionales = beneficiosAdicionales;
	    }
	    @Override
	    public double calcularSalario() {
	        return getSalario() + beneficiosAdicionales;
	    }
	    @Override
	    public void mostrarDetalles() {
	        System.out.println("Nombre: " + getNombre());
	        System.out.println("ID: " + getId());
	        System.out.println("Salario: " + calcularSalario());
	    }
}
