package EJ4_30_01_24;

import javax.swing.JOptionPane;


public class descuentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		descuento menos = new descuento();
		
	    menos.dameCant(Double.parseDouble(JOptionPane.showInputDialog("dime productos")));
		System.out.println(menos.dimeCant());
		menos.damePrecio(Double.parseDouble(JOptionPane.showInputDialog("dime precio")));
		menos.dameDescuento(); 
		System.out.println(menos.dimePrecio());
		
	}

}

class descuento{
	private double precio;
	private final double desc=0.10;
	private double productos;
	private double precioFinal;
	
	public descuento(){
	
	}
	public void dameCant(Double a){
		this.productos=a;
	}
	public Double dimeCant() {
		return productos;
	}
	public void damePrecio(Double b){
		precio=b;
	}
	public String dimePrecio() {
		if(productos<=5) {
			return "no tienes  descuento "+ precio;
		}else{
			return "tienes decuento "+ "aplicando el descuento es: "+ precioFinal;
		}
	}
	public void dameDescuento() {
		precioFinal =precio-((productos*precio)* desc);
	}
	
}
