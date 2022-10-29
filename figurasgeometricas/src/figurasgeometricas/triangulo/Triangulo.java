package figurasgeometricas.triangulo;

import figurasgeometricas.FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {

	public void lerDados() {
		try {
			System.out.println("Digite a base:");
			base = lerTeclado.nextDouble();
			System.out.println("Digite a altura:");
			altura = lerTeclado.nextDouble();
		} catch (Exception e) {
			System.err.println("O dado foi inserido de forma errada, tente usar \",\" no lugar de \".\"");
		}
	}

	public void calcularArea() {
		area = (base * altura) / 2;
	}

}
