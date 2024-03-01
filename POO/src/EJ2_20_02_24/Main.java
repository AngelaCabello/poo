package EJ2_20_02_24;

public class Main {
	public static void main(String[] args) {
        ProcesadorPago paypalProcesador = new PayPal_App();
        App_ProcessPago aplicacionPayPal = new App_ProcessPago(paypalProcesador);

        aplicacionPayPal.procesarPago(90.0);
        aplicacionPayPal.procesarReembolso(40.0);

        ProcesadorPago applepayProcesador = new Way_App();
        App_ProcessPago aplicacionApplePay = new App_ProcessPago(applepayProcesador);

        aplicacionApplePay.procesarPago(130.0);
        aplicacionApplePay.procesarReembolso(20.0);
    }
}
