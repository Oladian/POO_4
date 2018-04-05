package com.iesvirgendelcarmen.polimorfismo.teoria;

public class Elipse extends FiguraCircular {
	
	private float ejeMenor;
	private float ejeMayor;

	public Elipse(float ejeMenor, float ejeMayor) {
		super("ELIPSE", ejeMenor, ejeMayor);
		this.ejeMenor = ejeMenor;
		this.ejeMayor = ejeMayor;
	}

	@Override
	public float calcularPerimetro() {
		return (float) ((2*Math.PI)*Math.sqrt(((ejeMenor*ejeMenor)+(ejeMayor*ejeMayor))/2));
	}
}
