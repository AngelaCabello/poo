package EJ4_16_01_24;

public class productos {
		
	private String nombre;
	private double precio;
	private int stock;
	
	public productos() {
		
		nombre="cocacola";
		precio=2.35;
		stock=75;
	}
		public String dime_nombre() {//getter
			return nombre;
		}
		public void establece_nombre() {//setter
			nombre = "fanta";
		}
		public String dime_precio() {//getter
			return "el precio por botella es: "+precio;
		}
		public void establece_precio() {//setter
			precio = 1.50;
		}
		public String dime_stock() {//getter
			return "nos quedan estos stocks: "+ stock;
		}
		public void establece_stock() {//setter
			stock = 60;
		}
}
