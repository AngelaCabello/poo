package EJ3_17_01_24;

public class receta {

	private String ingrediente1;
	private String ingrediente2;
	private String ingrediente3;
	private String ingrediente4;
	private String ingrediente5;
	
	public receta() {
		
		ingrediente1="chocolate";
		ingrediente2="harina";
		ingrediente3="huevos";
		ingrediente4="aceite";
		ingrediente5="azucar";

	}

	public String dime_ingredientes() {// GETTER
		return "los ingredientes para hacer un brownie son" + ingrediente1+" "+ingrediente2+" "+ingrediente3+" "+ingrediente4+" "+ingrediente5;
	}

	public String dime_receta() { // GETTER
		return "primero coges el " + ingrediente1 + ingrediente2+ingrediente5 + 
				"y los mezclas todos, despues añades "+ingrediente3+ingrediente4
				+"ahora mezclamos todos junto hasta que quede una mezcla sin grumos"
				+ "por ultimo lo pones en un recipiente y al horno";
	}

}
