package EJ3_06_02_24;

	public class perro extends animal {
		    @Override
		    
		    public void emitirSonido() {
		        System.out.println("El perro ladra");
		    }
		    
		    public static void main(String[] args) {
		        animal animal = new animal();

		        animal.emitirSonido();

		        perro perro = new perro();

		        perro.emitirSonido();
		   }
		    
		}