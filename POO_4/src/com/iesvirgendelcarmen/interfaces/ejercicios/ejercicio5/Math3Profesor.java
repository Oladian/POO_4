package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio5;

import java.util.Arrays;

public final class Math3Profesor implements Extremos {

	private int[] listaEnteros;
	private double[] listaDoubles;
	
	public Math3Profesor(int[] listaEnteros, double[] listaDoubles) {
		this.listaEnteros = listaEnteros.clone();
		Arrays.sort(this.listaEnteros);
		this.listaDoubles = listaDoubles.clone();
		Arrays.sort(this.listaDoubles);
	}


	@Override
	public int min(int[] a) {
		 return listaEnteros[0];
	 }
		 

	@Override
	public int max(int[] a) {
		return listaEnteros[listaEnteros.length-1];
	}
	
	@Override
	public double min(double[] a) {
		return listaDoubles[0];
	}

	@Override
	public double max(double[] a) {
		return listaDoubles[listaDoubles.length-1];
	}


	public String toStringEnteros() {
		return Arrays.toString(listaEnteros);
	}


	public String toStringDoubles() {
		return Arrays.toString(listaDoubles);
	}


	@Override
	public String toString() {
		return "Math3Profesor [listaEnteros=" + Arrays.toString(listaEnteros) + ", listaDoubles="
				+ Arrays.toString(listaDoubles) + "]";
	}

	
	
}
