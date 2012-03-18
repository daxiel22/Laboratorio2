package es.upm.dit.adsw.lab2;

import java.util.Random;

public class Tiempos {
	
	private static final Random random = new Random();

	static long evalua(AbstractSorting algoritmo, int n) {
		int veces = 10000;
		long[] datos0 = mk(n, random);
		long[] datos = new long[n];
		long t1 = System.currentTimeMillis();
		for (int vez = 0; vez < veces; vez++) {
		System.arraycopy(datos0, 0, datos, 0, n);
		algoritmo.sort(datos);
		}
		long t2 = System.currentTimeMillis();
		return t2 - t1;
		}

	public static void main(String[] args) {
		AbstractSorting algoritmo = new Burbuja();
		int[] casos = new int[]{
		100, 200, 500, 1000, 2000,
		5000, 10000};
		System.out.println(algoritmo.getNombre());
		for (int n : casos) {
		long tiempoTotal = evalua(algoritmo, n);
		System.out.println(n + " " + tiempoTotal);
		}
		}

		private static long[] mk(int n, Random random) {
			long[] datos = new long[n];
			for (int i = 0; i < n; i++)
			datos[i] = random.nextLong();
			return datos;
		}

}
