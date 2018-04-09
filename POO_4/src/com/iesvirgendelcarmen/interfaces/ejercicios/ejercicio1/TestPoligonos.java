package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio1;

import java.util.List;

public class TestPoligonos {
	public static void main(String[] args) {
		
		PoligonoRegular triangulo1 = new TrianguloEquilatero(10);
		PoligonoRegular triangulo2 = new TrianguloEquilatero(10);
		PoligonoRegular triangulo3 = new TrianguloEquilatero(12);
		
		PoligonoRegular cuadrado1 = new Cuadrado(10);
		PoligonoRegular cuadrado2 = new Cuadrado(10);
		PoligonoRegular cuadrado3 = new Cuadrado(10);
		
		PoligonoRegular hexagono1 = new Hexagono(19);
		PoligonoRegular hexagono2 = new Hexagono(19);
		PoligonoRegular hexagono3 = new Hexagono(5);
		
		ListaPoligonoRegular lista = new ListaPoligonoRegular();
		
		lista.añadirPoligono(triangulo1);
		lista.añadirPoligono(triangulo2);
		lista.añadirPoligono(triangulo3);
		lista.añadirPoligono(cuadrado1);
		lista.añadirPoligono(cuadrado2);
		lista.añadirPoligono(cuadrado3);
		lista.añadirPoligono(hexagono1);
		lista.añadirPoligono(hexagono2);
		lista.añadirPoligono(hexagono3);
		
		List<PoligonoRegular> listaPoligonos = lista.getLista();
		
		for (PoligonoRegular poligonoRegular: listaPoligonos) {
			System.out.printf("%s Area: %.2f Perimetro: %.2f%n",
					poligonoRegular,poligonoRegular.getArea(),poligonoRegular.getPerimetro());
		}
		
		System.out.println("==================================================================");
		for (PoligonoRegular poligonoRegular : listaPoligonos) {
			if (poligonoRegular.equals(triangulo1)){
					System.out.println(poligonoRegular);
			}
		}
		System.out.println("==================================================================");
		for (PoligonoRegular poligonoRegular : listaPoligonos) {
			System.out.println(poligonoRegular.compareTo(triangulo1));
		}
	}
}
