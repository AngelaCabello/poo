package EJ5_23_01_24;

import javax.swing.JOptionPane;

public class uso_agenda_contactos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		agenda_contactos telf= new agenda_contactos();
		
		telf.establece_nombre(JOptionPane.showInputDialog("añadir contacto"));
		System.out.println(telf.dime_nombre());
		
		telf.establece_numTel(Integer.parseInt(JOptionPane.showInputDialog("telefono")));
		System.out.println(telf.dime_numTel());
		
		telf.establece_correo(JOptionPane.showInputDialog("e-mail"));
		System.out.println(telf.dime_correo());
	}

}
