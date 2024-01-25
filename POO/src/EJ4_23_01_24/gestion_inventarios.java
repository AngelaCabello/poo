package EJ4_23_01_24;

public class gestion_inventarios {

	private String nombre;
	private int cantidad;
	private double precio;
	
	public gestion_inventarios(){
		nombre = "coke";
		cantidad = 24;
		precio = 1.75;
	}
		public String dime_nombre() { //getter
			return "¿como se llama el producto? " + nombre;
		}
		public void establece_nombre(String nombre) { //setter
			this.nombre = nombre;
		}
		public String dime_cantidad() {
			return "¿cuanta cantidad quieres?" + cantidad;
		}
		public void establece_cantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public String dime_precio() {
			return "el precio es " + precio;
		}
		public void establece_precio(double precio) {
			this.precio=precio;
		}
}
