
import java.util.ArrayList;
import java.util.List;

public class GestionVehiculos{
    
    public void main(String[] args) {


 
        List<Vehiculo> vehiculos = new ArrayList<>();
        

        vehiculos.add(new Tesla("Tesla", "Model S", 2022, 79999.99, 100, 600, true));
        vehiculos.add(new Motocicleta("Yamaha", "MT-07", 2021, 7500.00, true, 300));
        vehiculos.add(new Auto("Toyota", "Corolla", 2020, 20000.00, 4, "Gasolina"));

    
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("A continuación se muestra la información de los vehículos :");
            vehiculo.mostrarInfo();
            vehiculo.encender();
        }
        
       
    }
}
