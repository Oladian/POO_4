package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio5;

public final class Math3 implements Extremos {

	
	
	@Override
	public int min(int[] a) {
		 int menor = a[0];
		 for (int i=1; i<a.length; i++) {
			 if (menor>a[i]) 
				 menor=a[i];
		 }
		 return menor;
	 }
		 

	@Override
	public int max(int[] a) {
		int mayor=a[0];
		for (int i = 1; i < a.length; i++) {
			if(mayor<a[i])
				mayor=a[i];
		}
		return mayor;
	}
	
	@Override
	public double min(double[] a) {
		double menor=a[0];
		for (int i = 1; i < a.length; i++) {
			if(menor>a[i])
				menor=a[i];
		}
		return menor;
	}

	@Override
	public double max(double[] a) {
		double mayor=a[0];
		for (int i = 1; i < a.length; i++) {
			if(mayor<a[i])
				mayor=a[i];
		}
		return mayor;
	}
}
