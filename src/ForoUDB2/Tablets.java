
package ForoUDB2;

public class Tablets extends Registro {
	
	private String tamaño_tipo_pantalla;
	
	private String sistema_operativo;
	
	//Constructor
	public Tablets (String fabricante, String modelo, String microprocesador, String capacidad, String tamaño_tipo_pantalla, String sistema_operativo){
		super(fabricante,modelo,microprocesador,"",capacidad);
		
		this.tamaño_tipo_pantalla = tamaño_tipo_pantalla;
		this.sistema_operativo = sistema_operativo;
	}
	
	public void mostrarDatos() {
		System.out.println("\\n Fabricante: " + getFabricante());
		System.out.println("\n Modelo: " + getModelo());
		System.out.println("\n Microprocesador: " + getMicroprocesador());
		System.out.println("\n Memoria NAND: " + getCapacidad());
		
		System.out.println("\n Tamaño pantalla y tipo: " + tamaño_tipo_pantalla);

		System.out.println("\n Sistema operativo: " + sistema_operativo);
		
		
		
	}

}