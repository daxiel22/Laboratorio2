package es.upm.dit.adsw.lab2;


public class JavaArrays 
		extends AbstractSorting{
	

	public String getNombre() {
		return "javaArrays";
	}

	
	public void sort(long[]datos) {
		java.util.Arrays.sort(datos);
		
	}

}
