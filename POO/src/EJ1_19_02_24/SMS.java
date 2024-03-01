package EJ1_19_02_24;

public class SMS extends Notificacion {
	    private final int limitCaracteres;
	    public SMS(String mensaje, String destinatario, int limitCaracteres, String detalle) {
	        super(mensaje, destinatario, detalle);
	        this.limitCaracteres = limitCaracteres;
	    }
	    @Override
	    public void enviar() {
	        if (getMensaje().length() > limitCaracteres) {
	            System.out.println("El mensaje es demasiado largo para enviar como SMS");
	        } else {
	            System.out.println("Enviando SMS a " + getDestinatario() + " con mensaje: " + getMensaje() + " y detalle: " + getDetalle());
	        }
	    }
	}