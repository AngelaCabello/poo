package EJ4_13_02_24;

public class BaseDatos extends Persistencia {
	    @Override
	    public void guardarDatos() {
	        System.out.println("Guardando datos en base de datos...");
	    }
	    @Override
	    public void cargarDatos() {
	        System.out.println("Cargando datos desde base de datos...");
	    }
}