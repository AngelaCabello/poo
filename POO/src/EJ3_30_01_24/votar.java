package EJ3_30_01_24;

import javax.swing.JOptionPane;


public class votar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		voto edad = new voto(1);
		
		edad.dameEdad(Integer.parseInt(JOptionPane.showInputDialog("dime edad")));
		
		System.out.println(edad.dimeEdad());
		
	
	}

}

class voto{
	private int edad;
	private final int min=18;
	
	public voto(int n){
		edad = n;
	}
	
	public String dimeEdad() {
		if(edad<=min) {
			return "no tienes edad para votar";
		}else{
			return "puedes votar";
		}
	}
	public void dameEdad(int n) {
		this.edad=n;
	}


}
