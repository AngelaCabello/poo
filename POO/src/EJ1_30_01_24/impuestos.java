package EJ1_30_01_24;

import javax.swing.JOptionPane;

public class impuestos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		impuesto producto1 =new impuesto("cocacola");
		impuesto producto2 =new impuesto("fanta naranja");
		
		producto1.dameProducto(JOptionPane.showInputDialog("nombre producto"));
		producto1.damePproducto(Double.parseDouble(JOptionPane.showInputDialog("precio producto")));
		
		producto2.dameProducto(JOptionPane.showInputDialog("nombre producto"));
		producto2.damePproducto(Double.parseDouble(JOptionPane.showInputDialog("precio producto")));
		
		System.out.println(producto1.dimeProducto());
		System.out.println(producto2.dimeProducto());
	
	}

}

class impuesto{
	private String producto;
	private double Pproducto;
	private final double iva= 1.15;
	public impuesto(String pro){
		producto= pro;
		
	}
	
	public String dimeProducto() {
		return producto + " el precio del producto es "+ Pproducto + " con el iva es "+(Pproducto*iva);
	}
	public void dameProducto(String producto) {
		this.producto=producto;
	}
	public void damePproducto(double Pproducto) {
		this.Pproducto=Pproducto;
	}
	
	
}