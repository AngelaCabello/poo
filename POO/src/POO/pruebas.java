package POO;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empleados trabajador1 =new empleados("Aurora");
		empleados trabajador2 =new empleados("Jack");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
	}

}

class empleados {
	private final String nombre;
	private String seccion;
	
	public empleados(String nom) {
		nombre = nom;
		seccion ="Administracion";
	}

	public void devuelveSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String devuelveDatos() {
		return "el nombre es "+ nombre+" y la seccion es " +seccion;
	}
	//public void cambiaNombre(String nombre) {
		//this.nombre = nombre;
	//}
	
}
