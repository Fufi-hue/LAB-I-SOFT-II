
import java.util.ArrayList;
import java.util.List;

public class GestionVehiculos{
    
    public void main(String[] args) {


 
        List<Vehiculo> vehiculos = new ArrayList<>();
        

        vehiculos.add(new Tesla("Tesla", "Model Y", 2020, 9000000, 100, 600, true));
        vehiculos.add(new Motocicleta("Honda", "REBEL 110", 2021, 100000, true, 300));
        vehiculos.add(new Auto("Hyundai", "Tucson", 2025, 28000, 4, "Gasolina"));

    
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("A continuación se muestra la información de los vehículos :");
            vehiculo.mostrarInfo();
            vehiculo.encender();
        }
        
       
    }
}
