package EJ4_31_01_24;

public class datos {

	public datos() {
		
	}
	public String validador(int n){
		if((n<100)&&(n>75)) {
			return "esta en el rango";
		}else {
			return "no esta en el rango";
		}
	}
}
