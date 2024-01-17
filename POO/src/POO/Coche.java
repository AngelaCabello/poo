package POO;

public class Coche {

	private int rueda;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	//*es un metodo especial que se encarga de dar estado inicial al objeto
	//*para construir un metodo contructor, debemos usar el mismo nombre que la clase
	
	public Coche() {
		ancho=250;
		largo=400;
		rueda=4;
		motor=200;
		peso=1900;
	}
	public String dime_motor() {
		return "el motor del coche tiene" + motor +"caballos de potencia";
	}
	/*public void establece_color() {
		color = "rojo";
	}*/
	public void establece_color(String color_coche) {
		color= color_coche;
	}
	
	public String dime_color() {
		return "el color es"+ color;
	}
	public String dime_datos_generales() {
		return "la plataforma ddel coche tiene" + rueda + " ruedas" +
				". Mide" + largo/1000+ "metros con un ancho de " + ancho +
				" centimetros y in peso de plataforma de "+ peso + " kg";
	}
	public void configura_asientos(String asientos_cuero) {//setter
			if(asientos_cuero=="si") {
				this.asientos_cuero=true;
			}else {
				this.asientos_cuero=false;
			}
	}
	public String dime_asientos() {
		if (asientos_cuero) {
			return "el coche tiene asientos de cuero";
		}else {
			return "tus asientos son de pena.";
			}
	}
}
