package EJ5_13_02_24;

public class Main {
	public static void main(String[] args) {
        Empleado empleado1 = new tiempoCompleto(3000);
        Empleado empleado2 = new tiempoParcial(30, 300);

        System.out.println("El salario del empleado a tiempo completo es: " + empleado1.calcularSalario() + "€");
        System.out.println("El salario del empleado a tiempo parcial es: " + empleado2.calcularSalario() + "€");
    }
}