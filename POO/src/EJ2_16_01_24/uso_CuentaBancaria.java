package EJ2_16_01_24;

public class uso_CuentaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria money = new CuentaBancaria();
		
		money.dime_titular();
		money.establece_saldo();
		System.out.println(money.dime_titular()+" y "+money.dime_saldo());
	}

}
