package com.iesvirgendelcarmen.interfaces.teoria;

public interface Direccionable {
	String getDireccion();
	String getCiudad();
	
	default String getNombreCompleto() {
		return getCiudad()+" ---- "+getDireccion();
	}
	
	default String getNombreSinCiudad() {
		return getDireccion();
	}
	
	static String getDefecto() {
		return "IES Virgen del Carmen, Paseo de la Estación 24";
	}
	
	
}
