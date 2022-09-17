package ForoUDB2;

public class Registro {
	private String fabricante;
	private String modelo;
	private String microprocesador;
	private String memoria;
	private String capacidad;

	public Registro(String fabricante, String modelo, String microprocesador, String memoria, String capacidad) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.microprocesador = microprocesador;
		this.memoria = memoria;
		this.capacidad = capacidad;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMicroprocesador() {
		return microprocesador;
	}
	
	public String getMemoria() {
		return memoria;
	}
	
	public String getCapacidad() {
		return capacidad;
	}
	
	
	
}
