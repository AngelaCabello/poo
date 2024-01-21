package EJ2_17_01_24;

public class ReservasHotel {

	private int numHabitacion;
	private String tipoHabitacion;
	private boolean ocupada;
	
	public ReservasHotel() {
		numHabitacion=25;
		tipoHabitacion="doble";
		ocupada=true;

	}

	public String dime_habitacion() {// GETTER
		return "el numero de habitacion es " + numHabitacion;
	}
	
	public void configura_habitacion(String dime_habitacion) {//SETTER
		if(dime_habitacion=="ocupada") {
			this.ocupada=true;
			System.out.println("esta ocupada");
		}else {
			this.ocupada=false;
			System.out.println("esta libre");
		}
	public String dime_hotel() { // GETTER
		return "el tipo de habitacion es " + tipoHabitacion;
	}
	
		
	}
}
