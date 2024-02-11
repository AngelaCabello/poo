package EJ3_31_01_24;

import javax.swing.JOptionPane;

public class uso_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conversion metro=new conversion();

		System.out.println("son "+metro.conv(Double.parseDouble(JOptionPane.showInputDialog("dime los kilometros")))+" metros");
		
	}

}
