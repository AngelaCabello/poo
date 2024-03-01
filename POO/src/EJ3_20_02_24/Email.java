package EJ3_20_02_24;

public class Email implements Notificable {
	    @Override
	    public void enviarNotificacion(String mensaje) {
	        System.out.println("Enviando correo electrónico: " + mensaje);
	    }
}
