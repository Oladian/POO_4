package com.iesvirgendelcarmen.polimorfismoConInterfaces.teoria;

//Aunque no se instancie, si se coloca un constructor el programa compila

public abstract class FiguraCircular implements Poligono {
	private String nombre;
	private float semiEjeMenor;
	private float semiEjeMayor;

	public FiguraCircular(String nombre, float semiEjeMenor, float semiEjeMayor) {
		this.nombre = nombre;
		this.semiEjeMenor = semiEjeMenor;
		this.semiEjeMayor = semiEjeMayor;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public float getSemiEjeMenor() {
		return semiEjeMenor;
	}

	public float getSemiEjeMayor() {
		return semiEjeMayor;
	}
	/* Una clase abstracta tiene que tener al menos un método abstracto
	 * Este método será usado por las clases hijas, ya que tanto Elipse
	 * como Circulo calcularán su perimetro, pero cada uno de forma
	 * diferente.
	 */
	
	@Override
	public abstract float calcularPerimetro(); 
	
	@Override
	public float calcularArea() {
		return (float) (NUMERO_PI*((semiEjeMenor*semiEjeMayor)));
	}



}
