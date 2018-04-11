package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio4;

public class TestArraysReales {
	public static void main(String[] args) {
		ArrayReales array = new ArrayReales();
		array.annadirValores(33.0);
		array.annadirValores(3.0);
		array.annadirValores(23.0);
		array.annadirValores(73.0);
		array.annadirValores(07.0);
		
		System.out.println(array.minimo());
		System.out.println(array.maximo());
		System.out.println(array.sumatorio());
	}
}
