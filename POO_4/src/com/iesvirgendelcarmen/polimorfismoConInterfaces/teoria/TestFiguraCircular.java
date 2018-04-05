package com.iesvirgendelcarmen.polimorfismoConInterfaces.teoria;

import java.util.ArrayList;
import java.util.List;

public class TestFiguraCircular {

	public static void main(String[] args) {
		
		
		List<FiguraCircular> listaFigCircular = new ArrayList<>();
		
		FiguraCircular circulo = new Circulo(10.f);
		FiguraCircular elipse = new Elipse(20, 30);
		Poligono poligonoCircular = new Circulo(5.f);
		Poligono poligonoEliptico = new Elipse(5, 15);
		
		System.out.printf("Area del %s: %.2f // Perimetro: %.2f%n",
				circulo.getNombre(),circulo.calcularArea(),circulo.calcularPerimetro());
		System.out.printf("Area de la %s: %.2f // Perimetro: %.2f%n",
				elipse.getNombre(),elipse.calcularArea(),elipse.calcularPerimetro());

		// Mostrando por pantalla los objetos de tipo Poligono
		
		System.out.printf("POLIGONO: area del %s: %.2f // Perimetro: %.2f%n",
				poligonoCircular.getNombre(),poligonoCircular.calcularArea(),poligonoCircular.calcularPerimetro());
		System.out.printf("POLIGONO: area de la %s: %.2f // Perimetro: %.2f",
				poligonoEliptico.getNombre(),poligonoEliptico.calcularArea(),poligonoEliptico.calcularPerimetro());
		
		listaFigCircular.add(circulo);
		listaFigCircular.add(elipse);
		listaFigCircular.add((FiguraCircular)poligonoCircular);
	}

}
