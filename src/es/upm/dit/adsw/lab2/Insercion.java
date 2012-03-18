package es.upm.dit.adsw.lab2;

/**
 * Algoritmo de ordenacion: insercion.
 *
 * @author Jose A. Manas
 * @version 23/1/2012
 */
public class Insercion
extends AbstractSorting {

	/**
	 * @return el nombre del algoritmo.
	 */
	public String getNombre() {
		return "insercion";
	}

	/**
	 * Ordena los datos, en el mismo array que se le pasa.
	 *
	 * @param datos datos a ordenar.
	 */
	public void sort(long[] datos) {
		for (int borde = 1; borde < datos.length; borde++) {
			long dato = datos[borde];
			int pos = borde;
			while (pos > 0 && datos[pos - 1] > dato) {
				datos[pos] = datos[pos - 1];
				pos--;
			}
			datos[pos] = dato;
		}
	}
}
