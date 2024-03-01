package EJ4_13_02_24;

public class Main {
	public static void main(String[] args) {

        Persistencia persistenciaArchivo = new Archivo();
        persistenciaArchivo.guardarDatos();
        persistenciaArchivo.cargarDatos();

        Persistencia persistenciaBaseDatos = new BaseDatos();
        persistenciaBaseDatos.guardarDatos();
        persistenciaBaseDatos.cargarDatos();
    }
}
