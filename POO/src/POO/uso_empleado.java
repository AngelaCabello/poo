package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
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
	}
		private String nombre;
		private double sueldo;
		private Date alta_contrato;
		
}
