package EJ2_23_01_24;

public class Calculadora_Sal {
	
	private String nombre;
	private int H_trabajadas;
	private double tarifa_hora;
	private double suma;
	
	public Calculadora_Sal() {
		nombre ="Alex";
		H_trabajadas=60;
		tarifa_hora=7.60;
		suma=H_trabajadas+tarifa_hora;
	}
	public String dime_nombre() { //getter
		return "el nombre del empleado es " + nombre;
	}
	public void establece_nombre(String nombre) { //setter
		this.nombre = nombre;
	}
	public String dime_H_trabajadas() {
		return "las horas que se han trabajado "+ H_trabajadas;
	}
	public void establece_H_trabajadas(int H_trabajadas) {
		this.H_trabajadas = H_trabajadas;
	}
	public String dime_tarifa_hora() {
		return "la tarifa por horas son " + tarifa_hora +" euros";
	}
	public void establece_tarifa_hora(double tarifa_hora) {
		this.tarifa_hora = tarifa_hora;
		}
	public Double dime_suma() { 
		return H_trabajadas*tarifa_hora;
}
}