package EJ4_31_01_24;

import javax.swing.JOptionPane;

public class main_datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		datos num= new datos();
		
		System.out.println("el numero "+num.validador(Integer.parseInt(JOptionPane.showInputDialog("dime un numero"))));
	}

}
