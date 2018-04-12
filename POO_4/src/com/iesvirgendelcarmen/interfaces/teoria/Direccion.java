package com.iesvirgendelcarmen.interfaces.teoria;

public class Direccion implements Direccionable {

	private String direccion;
	private String ciudad;
	
	public Direccion(String direccion, String ciudad) {
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

	@Override
	public String getDireccion() {
		return direccion;
	}

	@Override
	public String getCiudad() {
		return ciudad;
	}

}
