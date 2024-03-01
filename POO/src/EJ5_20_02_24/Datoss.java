package EJ5_20_02_24;

public class Datoss  implements Filtro, Orden {
	    private String[] datos;
	    public Datoss(String[] datos) {
	        this.datos = datos;
	    }
	    @Override
	    public void filtrar() {
	        System.out.println("Datos filtrados");
	    }
	    @Override
	    public void ordenar() {
	        System.out.println("Datos ordenados");
	    }
	}
