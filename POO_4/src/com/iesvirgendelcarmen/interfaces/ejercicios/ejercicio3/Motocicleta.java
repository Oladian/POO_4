package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio3;

public class Motocicleta extends TipoVehiculo{

	
	private int cilindrada;
	//private String nombre="moto";
	
	public Motocicleta(int velocidad, int cilindrada) {
		super(velocidad, 2);
		this.cilindrada = cilindrada;
	}
	
	public Motocicleta(int cilindrada) {
		super(2); //numero de plazas, inicializa la velocidad a 0
		this.cilindrada = cilindrada;
	}
	
	/*public Motocicleta(double cilindrada) {
		this(0, 2);
		this.cilindrada = (int) cilindrada;
	}*/

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String acelerar(int valor) {
		return "Motocicleta "+" "+getTipoCombustible()+" "+super.acelerar(valor);
	}
	
	@Override
	public String frenar(int valor) {
		return "Motocicleta "+" "+getTipoCombustible()+" "+super.frenar(valor);
	}
}
