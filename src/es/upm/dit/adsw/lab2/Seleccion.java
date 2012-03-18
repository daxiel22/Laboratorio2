package es.upm.dit.adsw.lab2;

/**
 * Algoritmo de ordenacion: seleccion.
 *
 * @author Jose A. Manas
 * @version 23/1/2012
 */
public class Seleccion
        extends AbstractSorting {

    /**
     * @return el nombre del algoritmo.
     */
    public String getNombre() {
        return "seleccion";
    }

    /**
     * Ordena los datos, en el mismo array que se le pasa.
     *
     * @param datos datos a ordenar.
     */
    public void sort(long[] datos) {
        for (int borde = 0; borde < datos.length - 1; borde++) {
            int pos = borde;
            long menor = datos[pos];
            for (int j = borde + 1; j < datos.length; j++) {
                if (datos[j] < menor) {
                    pos = j;
                    menor = datos[pos];
                }
            }
            if (pos != borde) {
                datos[pos] = datos[borde];
                datos[borde] = menor;
            }
        }
    }
}
