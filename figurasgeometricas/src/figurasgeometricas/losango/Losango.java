package figurasgeometricas.losango;

import figurasgeometricas.FiguraGeometrica;

public class Losango extends FiguraGeometrica {

	private double diagonalMaior;
	private double diagonalMenor;

	public void lerDados() {
		try {
			System.out.println("Digite a diagonal maior:");
			diagonalMaior = lerTeclado.nextDouble();
			System.out.println("Digite a diagonal menor:");
			diagonalMenor = lerTeclado.nextDouble();
		} catch (Exception e) {
			System.err.println("O dado foi inserido de forma errada, tente usar \",\" no lugar de \".\"");
		}
	}

	public void calcularArea() {
		area = (diagonalMaior * diagonalMenor) / 2;
	}

}
