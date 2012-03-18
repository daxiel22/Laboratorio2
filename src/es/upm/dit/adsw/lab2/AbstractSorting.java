package es.upm.dit.adsw.lab2;

/**
 * Algoritmos de ordenacion.
 *
 * @author Jose A. Manas
 * @version 23/1/2012
 */
public abstract class AbstractSorting {

	/**
	 * @return el nombre del algoritmo.
	 */
	public abstract String getNombre();

	/**
	 * Ordena los datos, en el mismo array que se le pasa.
	 *
	 * @param datos datos a ordenar.
	 */
	public abstract void sort(long[] datos);

	/**
	 * Intercambia dos datos en el array.
	 *
	 * @param datos array de datos.
	 * @param i     posicion de un elemento a intercambiar.
	 * @param j     posicion del otro elemento a intercambiar.
	 */
	protected void permuta(long[] datos, int i, int j) {
		long tmp = datos[i];
		datos[i] = datos[j];
		datos[j] = tmp;
	}

	/**
	 * Metodo auxiliar para comprobar que los datos estan ordenados.
	 *
	 * @param datos array de datos.
	 * @return true si los datos estan ordenados de menor a mayor.
	 */
	public boolean testOrdenados(long[] datos) {
		for (int i = 1; i < datos.length; i++) {
			if (datos[i - 1] > datos[i])
				return false;
		}
		return true;
	}
}
