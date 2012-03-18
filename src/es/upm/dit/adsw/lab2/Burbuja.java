package es.upm.dit.adsw.lab2;

/**
 * Algoritmo de ordenacion: burbuja.
 *
 * @author Jose A. Manas
 * @version 23/1/2012
 */
public class Burbuja
        extends AbstractSorting {

    /**
     * @return el nombre del algoritmo.
     */
    public String getNombre() {
        return "burbuja";
    }

    /**
     * Ordena los datos, en el mismo array que se le pasa.
     *
     * @param datos datos a ordenar.
     */
    public void sort(long[] datos) {
        boolean cambios;
        do {
//            System.out.println(Arrays.toString(datos));
            cambios = false;
            for (int i = 1; i < datos.length; i++) {
                long d1 = datos[i - 1];
                long d2 = datos[i];
                if (d1 > d2) {
                    datos[i - 1] = d2;
                    datos[i] = d1;
                    cambios = true;
                }
            }
        } while (cambios);
    }
}