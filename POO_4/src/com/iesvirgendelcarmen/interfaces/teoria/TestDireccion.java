package com.iesvirgendelcarmen.interfaces.teoria;

public class TestDireccion {
	public static void main(String[] args) {
		Direccion dir1 = new Direccion("Pepito Perez 43", "Pamplona");
		Direccionable dir2 = new Direccion("Avd Barcelona 3","Jaén");
		
		System.out.println(dir1.getNombreCompleto());
		System.out.println(dir2.getNombreSinCiudad());
		System.out.println(dir1.getDireccion()+" --- "+dir1.getCiudad());
		System.out.println(Direccionable.getDefecto());
	}
}
