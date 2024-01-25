package EJ2_23_01_24;

import javax.swing.JOptionPane;

public class uso_Calculadora_Sal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora_Sal empleado = new Calculadora_Sal ();
		
		for(int i=1;i<6;i++){
		
		empleado.establece_nombre(JOptionPane.showInputDialog("Nombre del Empleado"));
		System.out.println(empleado.dime_nombre());
		
		empleado.establece_H_trabajadas(Integer.parseInt(JOptionPane.showInputDialog("Horas que has trabajado")));
		System.out.println(empleado.dime_H_trabajadas());
		
		empleado.establece_tarifa_hora(Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto te pagan la hora?")));
		System.out.println(empleado.dime_tarifa_hora());
		
		System.out.println("su salario es: " + empleado.dime_suma());
		}
		
	}

}
