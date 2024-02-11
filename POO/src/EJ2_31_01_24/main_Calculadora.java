package EJ2_31_01_24;

import javax.swing.JOptionPane;

public class main_Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculadora cal=new calculadora();
		
		double a;
		double b;
		
		//suma
		a=Double.parseDouble(JOptionPane.showInputDialog("dime el primer numero"));
		b=Double.parseDouble(JOptionPane.showInputDialog("dime el segundo numero"));
		System.out.println("la suma es: "+cal.suma(a, b));
		
		//resta
		a=Double.parseDouble(JOptionPane.showInputDialog("dime el primer numero"));
		b=Double.parseDouble(JOptionPane.showInputDialog("dime el segundo numero"));
		System.out.println("la resta es: "+cal.resta(a, b));
		
		//mult
		a=Double.parseDouble(JOptionPane.showInputDialog("dime el primer numero"));
		b=Double.parseDouble(JOptionPane.showInputDialog("dime el segundo numero"));
		System.out.println("la multiplicacion es: "+cal.multiplicacion(a, b));
		
		//div
		a=Double.parseDouble(JOptionPane.showInputDialog("dime el primer numero"));
		b=Double.parseDouble(JOptionPane.showInputDialog("dime el segundo numero"));
		System.out.println("la division es: "+cal.division(a, b));
	}

}
