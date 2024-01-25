package EJ1_23_01_24;

import javax.swing.JOptionPane;

public class uso_Reg_Estudiantes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reg_Estudiantes estudiante = new Reg_Estudiantes();
		
		//estudiante1
		estudiante.establece_nombre(JOptionPane.showInputDialog("Nombre Estudiante"));
		System.out.println(estudiante.dime_nombre());
		
		estudiante.establece_edad(Integer.parseInt(JOptionPane.showInputDialog("Edad")));
		System.out.println(estudiante.dime_edad());
		
		estudiante.establece_grado(Integer.parseInt(JOptionPane.showInputDialog("Grado")));
		System.out.println(estudiante.dime_grado());
		
		//estudiante2
		estudiante.establece_nombre(JOptionPane.showInputDialog("Nombre Estudiante"));
		System.out.println(estudiante.dime_nombre());
		
		estudiante.establece_edad(Integer.parseInt(JOptionPane.showInputDialog("Edad")));
		System.out.println(estudiante.dime_edad());
		
		estudiante.establece_grado(Integer.parseInt(JOptionPane.showInputDialog("Grado")));
		System.out.println(estudiante.dime_grado());
		
		//estudiante3
		estudiante.establece_nombre(JOptionPane.showInputDialog("Nombre Estudiante"));
		System.out.println(estudiante.dime_nombre());
		
		estudiante.establece_edad(Integer.parseInt(JOptionPane.showInputDialog("Edad")));
		System.out.println(estudiante.dime_edad());
		
		estudiante.establece_grado(Integer.parseInt(JOptionPane.showInputDialog("Grado")));
		System.out.println(estudiante.dime_grado());
	}
}
