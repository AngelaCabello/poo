package EJ5_13_02_24;

public class tiempoCompleto extends Empleado {
	    private final double sueldoSemanal;
	    public tiempoCompleto(double sueldoSemanal) {
	        this.sueldoSemanal = sueldoSemanal;
	    }
	    @Override
	    public double calcularSalario() {
	        return sueldoSemanal * 4;
	    }
}
