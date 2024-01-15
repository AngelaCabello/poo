package POO;

public class Coche {

	int rueda;
	int largo;
	int ancho;
	int motor;
	int peso;
	//*es un metodo especial que se encarga de dar estado inicial al objeto
	//*para construir un metodo contructor, debemos usar el mismo nombre que la clase
	
	public Coche() {
		ancho=250;
		largo=400;
		rueda=4;
		motor=200;
		peso=1900;
	}
}
