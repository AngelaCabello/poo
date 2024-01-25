package EJ4_23_01_24;

import javax.swing.JOptionPane;

public class uso_gestion_inventario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gestion_inventarios almacen=new gestion_inventarios();
		
		for(int a=1;a<5;a++) {
		
		almacen.establece_nombre(JOptionPane.showInputDialog("Nombre del producto"));
		System.out.println(almacen.dime_nombre());
		
		almacen.establece_cantidad(Integer.parseInt(JOptionPane.showInputDialog("cantidad de producto")));
		System.out.println(almacen.dime_cantidad());
		
		almacen.establece_precio(Double.parseDouble(JOptionPane.showInputDialog("cuanto vale el producto")));
		System.out.println(almacen.dime_precio());
		
		}
	}

}
