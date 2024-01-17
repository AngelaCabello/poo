package POO;

public class uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//esto es instanciar una clase
		//esto es crear un ejemplar de una clase
		Coche honda = new Coche();
		System.out.println(honda.dime_motor());
		
		Coche subaro = new Coche();
		//subaro.establece_color();
		subaro.establece_color("azul");
		System.out.println(subaro.dime_datos_generales());
		System.out.println(subaro.dime_color());
		subaro.configura_asientos("si");
		System.out.println(subaro.dime_asientos());
	}

}
