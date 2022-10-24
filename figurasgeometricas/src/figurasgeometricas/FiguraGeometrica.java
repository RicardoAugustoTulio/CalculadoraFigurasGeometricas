package figurasgeometricas;

import java.util.Scanner;

public abstract class FiguraGeometrica implements Figuravel { //SUPERCLASSE

	protected double area;
	protected double base;
	protected double altura;
	protected Scanner lerTeclado;
	
	public void mostrarResultado() {
		System.out.println("Area: " + area);
	}
	
	public void setLerTeclado(Scanner lerTeclado) {
		this.lerTeclado = lerTeclado;
	}
}
