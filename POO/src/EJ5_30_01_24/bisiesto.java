package EJ5_30_01_24;

import javax.swing.JOptionPane;

public class bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bisi edad = new bisi();
		
		edad.dameAño(Integer.parseInt(JOptionPane.showInputDialog("dime año")));
		
		System.out.println(edad.dimeAño());
		
	
	}

}

class bisi{
	private int año;
	private final int bis1=4;
	private final int bis2=100;
	private final int bis3=400;
	
	public bisi(){
	}
	public int getAño() {
		return año;
	}
	
	public String dimeAño() {
		if(año%bis3==0) {
			return "El año:"+año+" ,es bisiesto";
		}else if((año%bis1==0)&&(año%bis2!=0)){
			return "El año:"+año+" ,es bisiesto";
		}else {
			return "El año:"+año+" ,no es bisiesto";
		}
	}
	public void dameAño(int n) {
		this.año=n;
	}
	
}
