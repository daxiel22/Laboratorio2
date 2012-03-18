package es.upm.dit.adsw.lab2;


public class QuickInsert extends AbstractSorting {
	
	private final static int UMBRAL = 100;
	
	public void quickinsert(long[] datos, int a, int z){
		if (z-a < UMBRAL)
			quicksort(datos, a, z);
		else
			sort(datos);
			
		
	}

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

	
	public String getNombre() {
		return "quickinsert";
	


		
	}

}
