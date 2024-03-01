package EJ2_20_02_24;

public class Way_App implements ProcesadorPago {
	    @Override
	    public void realizarPago(double dinero) {
	        System.out.println("Pago realizado correctamente mediante Way: " + dinero + "€");
	    }
	    @Override
	    public void reembolsarPago(double dinero) {
	        System.out.println("Reembolso realizado correctamente mediante Way: " + dinero + "€");
	    }
}
