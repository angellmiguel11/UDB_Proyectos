package ForoUDB2;
import java.util.Scanner;


public class Main {

	public static void main(String [] arg) {
		
		Desktops desktops = new Desktops ("ASUS","G35CZ","Intel i9","32GB","2TB SDD","RTX 3090 12GB", "50 cm");
		
		desktops.mostrarDatos();
		
		Laptops laptops = new Laptops ("HP","PAVILON","Intel i5","16GB","2TB HDD","16 pulgadas");
		
		laptops.mostrarDatos();
		
		Tablets tablets = new Tablets ("Samsung","Galaxy Tab S8","Qualcomm Snapdragon 8 Gen","250GB","11 Pulgadas - Capacitiva", "Android 11");
		
		tablets.mostrarDatos();
		

	}
	
}



	