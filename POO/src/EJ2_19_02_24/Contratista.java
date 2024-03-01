package EJ2_19_02_24;

public class Contratista extends Empleado {
	    private final int periodoContrato;
	    public Contratista(String nombre, int id, double salario, int periodoContrato) {
	        super(nombre, id, salario);
	        this.periodoContrato = periodoContrato;
	    }
	    @Override
	    public double calcularSalario() {
	        return getSalario();
	    }
	    @Override
	    public void mostrarDetalles() {
	        System.out.println("Nombre: " + getNombre());
	        System.out.println("ID: " + getId());
	        System.out.println("Salario: " + calcularSalario());
	        System.out.println("Periodo de contrato: " + periodoContrato + " meses");
	    }
}
