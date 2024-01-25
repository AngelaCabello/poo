package EJ5_23_01_24;

public class agenda_contactos {
	
	private String nombre;
	private int numTel;
	private String correo;
	
	public agenda_contactos() {
		nombre="hernando";
		numTel=689523560;
		correo="hernia.hernan@gmail.com";
	}
	public String dime_nombre() { //getter
		return "nombre: " + nombre;
	}
	public void establece_nombre(String nombre) { //setter
		this.nombre = nombre;
	}
	public String dime_numTel() {
		return "telefono: " + numTel;
	}
	public void establece_numTel(int numTel) { 
		this.numTel= numTel;
	}
	public String dime_correo() { 
		return "correo: " + correo;
	}
	public void establece_correo(String correo) {
		this.correo =correo;
	}
	
}
