package com.iesvirgendelcarmen.polimorfismo.teoria;

public class Circulo extends FiguraCircular {

	private float radio;
	
	public Circulo(float radio) {
		super("CIRCULO", radio, radio);
		this.radio = radio;
	}

	@Override
	public float calcularPerimetro() {
		return (float) (2*Math.PI*radio);
	}

	public float getRadio() {
		return radio;
	}

	@Override
	public String toString() {
		return super.toString()+"Circulo [radio=" + radio + "]";
	}

}
