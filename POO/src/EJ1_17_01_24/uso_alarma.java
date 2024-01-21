package EJ1_17_01_24;

public class uso_alarma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		alarma tin = new alarma();
		tin.configura_alarma("20.50");
				
				
		System.out.println(tin.dime_hora());
		System.out.println(tin.dime_alarma());
		tin.configura_alarma("suena");
			}

}
