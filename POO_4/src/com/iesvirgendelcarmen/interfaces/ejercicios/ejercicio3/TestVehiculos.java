package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio3;

public class TestVehiculos {

	public static void main(String[] args) {
		Vehiculo smart = new Smart(60);
		smart.setTipoCombustible(TipoCombustible.ELECTRICO);
		Vehiculo moto = new Motocicleta(90, 23);
		moto.setTipoCombustible(TipoCombustible.GAS);
		
		System.out.println(
		smart.acelerar(200)+
		"\n"+
		moto.frenar(50)+
		"\n"+
		smart.frenar(100)+
		"\n"+
		moto.acelerar(150)
		);
	}

}
