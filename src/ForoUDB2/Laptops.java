package ForoUDB2;

public class Laptops  extends Registro {
	
	private String tamaño_pantalla;
	
	//Constructor
	public Laptops (String fabricante, String modelo, String microprocesador, String memoria, String capacidad, String tamaño_pantalla) {
		super(fabricante,modelo,microprocesador,memoria,capacidad);
		
		this.tamaño_pantalla = tamaño_pantalla;
		
	}
	
	public void mostrarDatos() {
		System.out.println("Fabricante: " + getFabricante());
		System.out.println("\n Modelo: " + getModelo());
		System.out.println("\n Modelo: " + getMicroprocesador());
		System.out.println("\n Modelo: " + getMemoria());
		System.out.println("\n Modelo: " + getCapacidad());
		
		System.out.println("\n Modelo: " + tamaño_pantalla);
		
		
		
	}
	
}
