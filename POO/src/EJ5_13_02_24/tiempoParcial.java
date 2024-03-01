package EJ5_13_02_24;

public class tiempoParcial extends Empleado {
	    private final double sueldoPorHora;
	    private final double horasTrabajadas;
	    public tiempoParcial(double sueldoPorHora, double horasTrabajadas) {
	        this.sueldoPorHora = sueldoPorHora;
	        this.horasTrabajadas = horasTrabajadas;
	    }
	    @Override
	    public double calcularSalario() {
	        return sueldoPorHora * horasTrabajadas;
	    }
}
