package figurasgeometricas.quadrado;

import figurasgeometricas.FiguraGeometrica;

public class Quadrado
	extends FiguraGeometrica {

	private double lado;

	public void lerDados() {
		System.out.println("Digite o lado:");
		lado = lerTeclado.nextDouble();
	}

	public void calcularArea() {
		area = lado * lado;
	}

	
	
	
}
