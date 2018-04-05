package com.iesvirgendelcarmen.polimorfismo.teoria;

public class TestFiguraCircular {

	public static void main(String[] args) {
		
		FiguraCircular circulo = new Circulo(10.f);
		FiguraCircular elipse = new Elipse(20, 30);
		
		System.out.printf("Area del %s: %.2f // Perimetro: %.2f%n",
				circulo.getNombre(),circulo.calcularArea(),circulo.calcularPerimetro());
		
		System.out.printf("Area de la %s: %.2f // Perimetro: %.2f",
				elipse.getNombre(),elipse.calcularArea(),elipse.calcularPerimetro());
	}

}
