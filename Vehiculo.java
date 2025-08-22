public class Vehiculo{
    protected String marca;
    protected String modelo;
    protected int año;
    protected double precio;

    public Vehiculo(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAño() {
        return año;
    }
    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Precio: " + precio);
    }

    public void encender() {
        System.out.println("El vehículo " + marca + " " + modelo + "del " + año + " se ha encendido ");
    }
}
