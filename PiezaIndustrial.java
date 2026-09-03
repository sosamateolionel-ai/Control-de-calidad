public class PiezaIndustrial {

    private String codigoPieza;
    private double longitudMilimetros;
    private double longitudEstandar;

    public PiezaIndustrial(String codigoPieza, double longitudMilimetros, double longitudEstandar) {

        if (longitudMilimetros <= 0) {
            throw new IllegalArgumentException(
                    "La longitud de la pieza debe ser positiva"
            );
        }

        if (longitudEstandar <= 0) {
            throw new IllegalArgumentException(
                    "La longitud estándar debe ser positiva"
            );
        }

        this.codigoPieza = codigoPieza;
        this.longitudMilimetros = longitudMilimetros;
        this.longitudEstandar = longitudEstandar;
    }

    public boolean esAceptable() {
        double diferencia = Math.abs(longitudMilimetros - longitudEstandar);

        return diferencia <= 0.5;
    }

    public void mostrarResultado() {
        System.out.println("Código de pieza: " + codigoPieza);
        System.out.println("Longitud medida: " + longitudMilimetros + " mm");
        System.out.println("Longitud estándar: " + longitudEstandar + " mm");

        if (esAceptable()) {
            System.out.println("Dictamen: PIEZA ACEPTABLE");
        } else {
            System.out.println("Dictamen: PIEZA NO ACEPTABLE");
        }

        System.out.println("================================");
    }

    public static void main(String[] args) {

        PiezaIndustrial pieza1 = new PiezaIndustrial(
                "P001",
                100.3,
                100.0
        );

        PiezaIndustrial pieza2 = new PiezaIndustrial(
                "P002",
                101.0,
                100.0
        );

        pieza1.mostrarResultado();
        pieza2.mostrarResultado();
    }
}