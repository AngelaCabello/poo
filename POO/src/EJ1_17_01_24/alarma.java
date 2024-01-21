package EJ1_17_01_24;

public class alarma {

		private String HoraAlarma;
		private String HoraActual;
		private boolean activada;
		
		public alarma() {
			HoraAlarma="17.20";
			HoraActual="16.00";
			activada=true;

		}

		public String dime_hora() {// GETTER
			return "actualmente son las " + HoraActual + " horas";
		}

		public String dime_alarma() { // GETTER
			return "la alarma sonara a las " + HoraAlarma;
		}
		
		public void configura_alarma(String sonar_alarma) {//SETTER
			if(sonar_alarma=="HoraAlarma") {
				this.activada=true;
				System.out.println("esta sonando");
			}else {
				this.activada=false;
				System.out.println("aun falta para que suene");
			}
			
		}

}
