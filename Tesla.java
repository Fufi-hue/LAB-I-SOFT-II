public class Tesla extends VehiculoElectrico {
    private final boolean autopilot;

    public Tesla(String marca, String modelo, int año, double precio, int capacidadBateria, int autonomia, boolean autopilot) {
        super(marca, modelo, año, precio, capacidadBateria, autonomia);
        this.autopilot = autopilot;
    }


    @Override
    public void tiempoCarga() {
        System.out.println("Se esta calculando el tiempo de carga");
    }

    @Override
    public void calcularConsumo() {
       
    }

    public void activarAutopilot() {
        if (autopilot) {
            System.out.println("Autopilot activado en el Tesla ");
        } else {
            System.out.println("Este Tesla no tiene Autopilot.");
        }
    }

}
