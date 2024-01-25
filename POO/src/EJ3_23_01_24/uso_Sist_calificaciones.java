package EJ3_23_01_24;

import javax.swing.JOptionPane;

public class uso_Sist_calificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sist_calificaciones notas = new Sist_calificaciones();
		
		notas.establece_nombreCurso(JOptionPane.showInputDialog("Nombre Curso"));
		System.out.println(notas.dime_nombreCurso());
		
		notas.establece_calificacion(Integer.parseInt(JOptionPane.showInputDialog("calificacion")));
		System.out.println(notas.dime_calificacion());
		
		int Nclase1=1;
		String Nclase;
		
		Nclase1=notas.dime_calificacion();
		
		switch(Nclase1) {
		case 1:
			Nclase ="A";
			break;
		case 2:
			Nclase ="B";
			break;
		case 3:
			Nclase ="C";
			break;
		case 4:
			Nclase ="D";
			break;
		case 5:
			Nclase ="E";
			break;
		case 6:
			Nclase ="F";
			break;
		default:
			Nclase="ya no hay mas";
		}
		System.out.println("tu clase es " +Nclase);
	}

}
