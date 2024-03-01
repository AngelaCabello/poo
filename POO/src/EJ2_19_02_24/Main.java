package EJ2_19_02_24;

public class Main {
	public static void main(String[] args) {
        Permanente empPermanente1 = new Permanente("Sebastian", 1021, 40000);
        empPermanente1.mostrarDetalles();

        System.out.println();

        Temporal empTemporal1 = new Temporal("Manuel", 2021, 50000, 7);
        empTemporal1.mostrarDetalles();

        System.out.println();

        Contratista empContratista1 = new Contratista("Pedro", 3021, 80000, 10);
        empContratista1.mostrarDetalles();
    }
}
