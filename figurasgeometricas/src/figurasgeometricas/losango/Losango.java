package figurasgeometricas.losango;

import figurasgeometricas.FiguraGeometrica;

public class Losango
	extends FiguraGeometrica {

	private double diagonalMaior;
	private double diagonalMenor;
	
	public void lerDados() {
		System.out.println("Digite a diagonal maior:");
		diagonalMaior = lerTeclado.nextDouble();
		System.out.println("Digite a diagonal menor:");
		diagonalMenor = lerTeclado.nextDouble();
	}

	public void calcularArea() {
		area = (diagonalMaior * diagonalMenor) / 2;
	}
	
}
