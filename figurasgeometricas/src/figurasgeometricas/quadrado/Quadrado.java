package figurasgeometricas.quadrado;

import figurasgeometricas.FiguraGeometrica;

public class Quadrado extends FiguraGeometrica {

	private double lado;

	public void lerDados() {
		try {
			System.out.println("Digite o lado:");
			lado = lerTeclado.nextDouble();
		} catch (Exception e) {
			System.err.println("O dado foi inserido de forma errada, tente usar \",\" no lugar de \".\"");
		}
	}

	public void calcularArea() {
		area = lado * lado;
	}

}
