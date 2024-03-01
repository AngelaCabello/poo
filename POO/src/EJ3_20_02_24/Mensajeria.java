package EJ3_20_02_24;

public class Mensajeria implements Notificable {
	    @Override
	    public void enviarNotificacion(String mensaje) {
	        System.out.println("Enviando mensaje desde la app: " + mensaje);
	    }
}
