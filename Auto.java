public class Auto extends Vehiculo {
    private final int numeroPuertas;
    private final String tipoTransmision;

    public Auto(String marca, String modelo, int año, double precio, int numeroPuertas, String tipoTransmision) 
    {
        super(marca, modelo, año, precio);
        this.numeroPuertas = numeroPuertas;
        this.tipoTransmision = tipoTransmision;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Puertas: " + numeroPuertas);
        System.out.println("Tipo de Transmisión: " + tipoTransmision);
    }

    public void activarAireAcondicionado() {
        System.out.println("Aire acondicionado activado");
    }
}