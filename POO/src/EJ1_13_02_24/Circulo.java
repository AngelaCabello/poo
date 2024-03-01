package EJ1_13_02_24;

public class Circulo extends FiguraGeometrica {
	    double radio;
	    Circulo(double radio) {
	        this.radio = radio;
	    }
	    double calcularArea() {
	        return Math.PI * radio * radio;
	    }
	}