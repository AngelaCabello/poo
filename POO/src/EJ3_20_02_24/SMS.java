package EJ3_20_02_24;

public class SMS implements Notificable {
	    @Override
	    public void enviarNotificacion(String mensaje) {
	        System.out.println("Enviando SMS: " + mensaje);
	    }
}
