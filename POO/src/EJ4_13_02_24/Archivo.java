package EJ4_13_02_24;

public class Archivo extends Persistencia {
	    @Override
	    public void guardarDatos() {
	        System.out.println("Guardando datos en archivo...");
	    }
	    @Override
	    public void cargarDatos() {
	        System.out.println("Cargando datos desde archivo...");
	    }
}