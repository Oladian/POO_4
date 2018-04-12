package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio4;

import java.util.List;
import java.util.ArrayList;

public class ArrayReales implements Estadisticas {

	private List<Double> listaDeValores = new ArrayList<>();
	private double[] coleccionDouble;
	
	
	public ArrayReales(double[] coleccionDouble) {
		this.coleccionDouble = coleccionDouble;
	}

	public ArrayReales() {
		coleccionDouble = new double[10];
	}
	
	public boolean annadirValores(double valor){
		return listaDeValores.add(valor);
	}
	
	@Override
	public double minimo() {
		double minimo = listaDeValores.get(0);
		for (int i = 0; i < listaDeValores.size(); i++) {
			if(listaDeValores.get(i)<minimo)
				minimo=listaDeValores.get(i);
		}
		return minimo;
	}
	
	@Override
	public double minimoColeccion() {
		double menor = coleccionDouble[0];
		for (int i = 0; i < coleccionDouble.length; i++) {
			if(coleccionDouble[i]>menor)
				menor=coleccionDouble[i];
		}
		return menor;
	}

	@Override
	public double maximo() {
		double maximo = listaDeValores.get(0);
		for (int i = 0; i < listaDeValores.size(); i++) {
			if(listaDeValores.get(i)>maximo)
				maximo=listaDeValores.get(i);
		}
		return maximo;
	}

	@Override
	public double maximoColeccion() {
		double maximo = coleccionDouble[0];
		for (int i = 0; i < coleccionDouble.length; i++) {
			if(coleccionDouble[i]>maximo)
				maximo=coleccionDouble[i];
		}
		return maximo;
	}

	@Override
	public double sumatorio() {
		double suma=0;
		for (int i = 0; i < listaDeValores.size(); i++) {
			suma+=listaDeValores.get(i);
		}
		return suma;
	}
	
	@Override
	public double sumatorioColeccion() {
		double suma=0;
		for (int i = 0; i < coleccionDouble.length; i++) {
			suma+=coleccionDouble[i];
		}
		return suma;
	}
}
