package EJ1_19_02_24;

public class main {
	public static void main(String[] args) {
        Email correo = new Email("Hola", "pruebaaaaaaa@gmail.com", "Prueba", "Adios");
        correo.enviar();

        SMS sms = new SMS("Hola", "657493784", 160, "Prueba");
        sms.enviar();

        Not_App notificacionApp = new Not_App("Hola", "Usuario", "659846325", "Prueba");
        notificacionApp.enviar();
    }
}
