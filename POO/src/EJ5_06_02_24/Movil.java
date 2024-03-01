package EJ5_06_02_24;

public class Movil extends Dispositivos {
	    public Movil(String fabricante, int anoDeFabricacion) {
	        super(fabricante, anoDeFabricacion);
	    }
	    public void instalarApp(String aplicacion) {
	        System.out.println("Instalando la aplicación " + aplicacion);
	    }
	    public static void main(String[] args) {

	        Movil smartphone = new Movil("Huawei", 2023);

	        System.out.println("Fabricante: " + smartphone.getFabricante());
	        System.out.println("Año de Fabricación: " + smartphone.getAnoDeFabricacion());

	        Telefono telefono = new Telefono();
	        telefono.llamar("589645237");
	        telefono.recibirLlamadas();

	        smartphone.instalarApp("Telegram");
	    }
}