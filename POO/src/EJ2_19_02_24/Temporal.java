package EJ2_19_02_24;

public class Temporal extends Empleado {
	    private final int periodoContrato;
	    public Temporal(String nombre, int id, int periodoContrato) {
	        super(nombre, id);
	        this.periodoContrato = periodoContrato;
	    }
	    public Temporal(String nombre, int id, double salario, int periodoContrato) {
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
