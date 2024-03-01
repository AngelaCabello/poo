package EJ4_20_02_24;

public class Main {
	public static void main(String[] args) {
        Exportable reporte = new Reporte("Datos del reporte");

        Sis_Reporte.exportarReporte(reporte, "CSV");
        Sis_Reporte.exportarReporte(reporte, "PDF");
    }
}
