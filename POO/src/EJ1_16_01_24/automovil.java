package EJ1_16_01_24;

public class automovil {
	private String marca;
	private String modelo;
	
	public automovil() {
		marca="nissan";
		modelo="agt";
		
	}
	public String dime_marca() {//getter
		return "la marca del coche es " + marca;
	}
	public void establece_marca() {//setter
		marca = "ggt";
	}
	public String dime_modelo() {//getter
		return "el modelo del coche: " + modelo;
	}
	public void establece_modelo() {//setter
		modelo = "abc";
	}
}

