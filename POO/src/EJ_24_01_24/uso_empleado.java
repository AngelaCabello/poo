package EJ_24_01_24;

import java.util.Date;
import java.util.GregorianCalendar;

public class uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empleado [] misEmpleados = new empleado[3];
		misEmpleados[0]= new empleado("Jorge N.", 19500, 2000, 12, 30);
		misEmpleados[1]= new empleado("Paco J.", 79500, 1980, 12, 28);
		misEmpleados[2]= new empleado("Ana B.", 69500, 1995, 11, 18);
		
		/*for(int i=0; i<3; i++) {
		misEmpleados[i].subeSueldo(5);
	}
	for(int i=0; i<3; i++) {
		System.out.println("Nombre: " + misEmpleados[i].
				dameNombre() + " Sueldo: " + 
				misEmpleados[i].dameSueldo() + " Fecha de Alta: " + 
				misEmpleados[i].dameFechaContrato());
	}*/
		
		for(empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		for(empleado e: misEmpleados) {
			System.out.println("Nombre: " + 
					e.dameNombre() + " Sueldo: " + 
					e.dameSueldo() + " Fecha de Alta: " + 
					e.dameFechaContrato());
	}
}
}
	class empleado{
		public empleado(String nom, double sue,int agno, int mes, int dia) {
			nombre= nom;
			sueldo=sue;
			
			GregorianCalendar calendario= new GregorianCalendar(agno,mes-1, dia);
			
			alta_contrato=calendario.getTime();
		}
			public String dameNombre() {
				return nombre;
			}
			public double dameSueldo() {
				return sueldo;
			}
			public Date dameFechaContrato() {
				return alta_contrato;
			}
			public void subeSueldo(double porcentaje) {
				double aumento = sueldo*porcentaje/100;
				sueldo += aumento;
			}
	
		private String nombre;
		private double sueldo;
		private Date alta_contrato;
}


