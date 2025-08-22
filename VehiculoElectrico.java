abstract class VehiculoElectrico extends Vehiculo {
    protected  int capacidadBateria;
    protected int autonomia;

    public VehiculoElectrico(String marca, String modelo, int año, double precio, int capacidadBateria, int autonomia) {
        super(marca, modelo, año, precio);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public void cargarBateria() {
        System.out.println("Se está cargando la batería del vehículo " + marca + " " + modelo );
    }

    public abstract void calcularConsumo();

       
    public abstract void tiempoCarga();


}