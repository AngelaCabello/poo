package EJ3_20_02_24;

public class Main {
	public static void main(String[] args) {
        Notificable correo = new Email();
        Notificable sms = new SMS();
        Notificable mensajeApp = new Mensajeria();

        Sis_Not.enviarNotificacion(correo, "¡Hola desde el correo electrónico!");
        Sis_Not.enviarNotificacion(sms, "¡Hola desde el SMS!");
        Sis_Not.enviarNotificacion(mensajeApp, "¡Hola desde mensajería!");
    }
}
