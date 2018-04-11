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
		
		lista.addPoligono(triangulo1);
		lista.addPoligono(triangulo2);
		lista.addPoligono(triangulo3);
		lista.addPoligono(cuadrado1);
		lista.addPoligono(cuadrado2);
		lista.addPoligono(cuadrado3);
		lista.addPoligono(hexagono1);
		lista.addPoligono(hexagono2);
		lista.addPoligono(hexagono3);
		
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
		
		for (PoligonoRegular poligonoRegular : listaPoligonos) {
			System.out.println(poligonoRegular.compareTo(triangulo1));
		}
		
		System.out.println("==================================================================");	
		System.out.println(lista.getListaOrdenada());
	}
}
