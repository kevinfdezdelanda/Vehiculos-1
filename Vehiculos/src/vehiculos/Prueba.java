package vehiculos;

public class Prueba {
	public static void main(String[] args) {
		Camion camion = new Camion("rojo", (byte) 4);
		Vehiculo vehiculo = new Vehiculo((byte)4);
		
		vehiculo.verVehiculo();  
		camion.verCamion();  
	} 
}
