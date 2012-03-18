package es.upm.dit.adsw.lab2;


/**
 * Algoritmo de ordenacion: quick sort.
 *
 * @author Jose A. Manas
 * @version 23/1/2012
 */
public class QuickSort
        extends AbstractSorting {

    /**
     * @return el nombre del algoritmo.
     */
    public String getNombre() {
        return "quicksort";
    }

    /**
     * Ordena los datos, en el mismo array que se le pasa.
     *
     * @param datos datos a ordenar.
     */
    public void sort(long[] datos) {
        quicksort(datos, 0, datos.length);
    }

    /**
     * Auxiliar: ordena una fraccion de los datos.
     *
     * @param datos todos los datos.
     * @param a     ordenar desde la posicion a.
     * @param z     ordenar hasta la posicion z-1.
     */
    private void quicksort(long[] datos, int a, int z) {
        long pivote = datos[(a + z) / 2];
        int inf = a;
        int sup = z;
        while (inf < sup) {
            while (datos[inf] < pivote)
                inf++;
            while (pivote < datos[sup - 1])
                sup--;
            if (inf < sup) {
                long tmp = datos[inf];
                datos[inf] = datos[sup - 1];
                datos[sup - 1] = tmp;
                inf++;
                sup--;
            }
        }
        if (a < sup)
            quicksort(datos, a, sup);
        if (inf < z)
            quicksort(datos, inf, z);
    }
}
