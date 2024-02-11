package EJ2_30_01_24;

import javax.swing.JOptionPane;

public class temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temp grado = new temp(1.2);
		
		grado.dameGrados(Double.parseDouble(JOptionPane.showInputDialog("dime grados")));
		
		System.out.println(grado.dimeGrados());
		
	
	}

}

class temp{
	private double grados;
	private final double conv1=1* 1.8;
	private final double conv2=32;
	
	public temp(Double gr){
		grados = gr;
		
	}
	
	public String dimeGrados() {
		return " los grados sin convertir son "+ grados + " convertidos son "+((grados*conv1)+conv2);
	}
	public void dameGrados(double gr) {
		this.grados=gr;
	}

}
