package EJ1_19_02_24;

public class Email extends Notificacion {
	    private final String asunto;
	    public Email(String mensaje, String destinatario, String asunto, String detalle) {
	        super(mensaje, destinatario, detalle);
	        this.asunto = asunto;
	    }
	    @Override
	    public void enviar() {
	        System.out.println("Enviando correo electrónico a " + getDestinatario() + " con asunto: " + asunto + " y mensaje: " + getMensaje() + " y detalle: " + getDetalle());
	    }
}