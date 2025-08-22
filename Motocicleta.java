public class Motocicleta extends Vehiculo {
    private final int cilindrada;
    private final boolean tieneSidecar;
    

    public Motocicleta(String marca, String modelo, int año, double precio, boolean tieneSidecar, int cilindrada) {
        super(marca, modelo, año, precio);
        this.cilindrada = cilindrada;
        this.tieneSidecar = tieneSidecar;
        
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Tiene Sidecar: " + (tieneSidecar ? "Sí" : "No"));
        
    }

    public void hacerCaballito() {
        System.out.println("¡Haciendo caballito!");
    }

}
