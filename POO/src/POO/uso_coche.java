package POO;

import javax.swing.JOptionPane;

public class uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Coche Subaru = new Coche();
				Subaru.establece_color("Amarillo");
				/*3. Aquí, mete en establece_color un valor para darle color al coche
				 * Este parámetro se almacena en color_coche.
				 * Los valores se pueden pasar por parámetro y por referencia.
				 * Lo veremos más adelante.*/
				
				//Subaru.color="Morado Podemita";
				
				/*5. Con este paso se crea un problema de encapsulamiento.
				 * Si recuerdas, anteriormente dije que poniendo las cosas
				 * en private, podías evitar cambios. Color no tiene el modificador
				 * de acceso private y, por tanto, puede editarse. 
				 * Cambia el color del coche al ejemplo.
				 * Nunca debes poder manipular la instancia del objeto.
				 * Cambia las características particulares a private
				 * Ve a Coche.java*/
				
				
				/*7. Como ves, se genera un error con Subaru.color
				 * Ya no es pública.
				 * Vete a Coche.java*/
				Subaru.establece_color(JOptionPane.showInputDialog("introduce el color"));
				System.out.println(Subaru.dime_color());
				Subaru.configura_asientos(JOptionPane.showInputDialog("¿tienes climarizador o sos motochorro?"));
				System.out.println(Subaru.dime_climatizador());
				System.out.println(Subaru.dime_peso_coche());
				System.out.println("el precio final del coche "+ Subaru.precio_coche());
				
				/*9. Comenta o borra la línea de Subaru.color="Morado Podemita";
				 * Vete a Coche.Java*/
				
				System.out.println(Subaru.dime_datos_generales());
				System.out.println(Subaru.dime_color());
				/*14. Vamos a ver tu coche y sus asientos. */
				Subaru.configura_asientos("si");
				System.out.println(Subaru.dime_asientos());
			}

		
	}