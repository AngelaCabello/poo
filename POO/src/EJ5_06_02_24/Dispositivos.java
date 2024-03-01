package EJ5_06_02_24;

public class Dispositivos {

	    private String fabricante;
	    private int anoDeFabricacion;
	    public Dispositivos(String fabricante, int anoDeFabricacion) {
	        this.fabricante = fabricante;
	        this.anoDeFabricacion = anoDeFabricacion;
	    }
	    public String getFabricante() {
	        return fabricante;
	    }
	    public void setFabricante(String fabricante) {
	        this.fabricante = fabricante;
	    }
	    public int getAnoDeFabricacion() {
	        return anoDeFabricacion;
	    }
	    public void setAnoDeFabricacion(int anoDeFabricacion) {
	        this.anoDeFabricacion = anoDeFabricacion;
	    }
	}
