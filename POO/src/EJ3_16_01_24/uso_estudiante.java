package EJ3_16_01_24;

public class uso_estudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		estudiante persona =new estudiante();
		
		persona.dime_nombre();
		persona.dime_edad();
		persona.dime_calificacion();
		System.out.println(persona.dime_nombre()+", "+persona.dime_edad()+" y "+persona.dime_calificacion());
		
	}

}
