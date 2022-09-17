package ForoUDB2;

public class Desktops extends Registro {

	private String tarjeta_grafica;
	private String tamaño_torre;
	
	//Constructor
	public Desktops (String fabricante, String modelo, String microprocesador, String memoria, String capacidad, String tarjeta_grafica, String tamaño_torre) {
		super(fabricante,modelo,microprocesador,memoria,capacidad);
		
		this.tarjeta_grafica = tarjeta_grafica; 
		this.tamaño_torre = tamaño_torre;
	}
	
	public void mostrarDatos() {
		System.out.println("Fabricante: " + getFabricante());
		System.out.println("\n Modelo: " + getModelo());
		System.out.println("\n Modelo: " + getMicroprocesador());
		System.out.println("\n Modelo: " + getMemoria());
		System.out.println("\n Modelo: " + getCapacidad());
		
		System.out.println("\n Modelo: " + tarjeta_grafica);
		System.out.println("\n Modelo: " + tamaño_torre);
		
		
	}
	
	
}
