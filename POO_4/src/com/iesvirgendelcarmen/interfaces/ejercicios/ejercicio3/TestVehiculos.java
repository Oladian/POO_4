package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio3;

public class TestVehiculos {

	public static void main(String[] args) {
		Vehiculo coche = new Coche();
		Vehiculo motocicleta = new Motocicleta();
		
		System.out.println(coche.acelerar(220));
		System.out.println(motocicleta.acelerar(220));
		
		System.out.println(coche.frenar(20));
		System.out.println(motocicleta.acelerar(20));
		
	}

}
