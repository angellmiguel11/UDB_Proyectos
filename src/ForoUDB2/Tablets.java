
package ForoUDB2;

public class Tablets extends Registro {
	
	private String tamaño_tipo_pantalla;
	private String tamaño_memoria_nand;
	private String sistema_operativo;
	
	//Constructor
	public Tablets (String fabricante, String modelo, String microprocesador, String capacidad, String tamaño_tipo_pantalla, String tamaño_memoria_nand, String sistema_operativo){
		super(fabricante,modelo,microprocesador,"",capacidad);
		
		this.tamaño_tipo_pantalla = tamaño_tipo_pantalla;
		this.tamaño_memoria_nand = tamaño_memoria_nand;
		this.sistema_operativo = sistema_operativo;
	}
	
	public void mostrarDatos() {
		System.out.println("\\n Fabricante: " + getFabricante());
		System.out.println("\n Modelo: " + getModelo());
		System.out.println("\n Modelo: " + getMicroprocesador());
		System.out.println("\n Modelo: " + getCapacidad());
		
		System.out.println("\n Modelo: " + tamaño_tipo_pantalla);
		System.out.println("\n Modelo: " + tamaño_memoria_nand);
		System.out.println("\n Modelo: " + sistema_operativo);
		
		
		
	}

}