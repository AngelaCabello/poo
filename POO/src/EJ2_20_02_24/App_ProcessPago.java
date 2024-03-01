package EJ2_20_02_24;

public class App_ProcessPago {
	    private final ProcesadorPago procesadorDePago;
	    public App_ProcessPago(ProcesadorPago procesadorDePago) {
	        this.procesadorDePago = procesadorDePago;
	    }
	    public void procesarPago(double dinero) {
	        procesadorDePago.realizarPago(dinero);
	    }
	    public void procesarReembolso(double dinero) {
	        procesadorDePago.reembolsarPago(dinero);
	    }
	}
