package EJ2_16_01_24;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	
	public CuentaBancaria() {
		titular="Pepito";
		saldo=500;
		
	}
	public String dime_titular() {//getter
		return "el titular es " + titular;
	}
	public void establece_titular() {//setter
		titular = "Pepe";
	}
	public String dime_saldo() {//getter
		return "el saldo de la cuenta: " + saldo;
	}
	public void establece_saldo() {//setter
		saldo = 500;
	}
}
