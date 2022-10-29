package figurasgeometricas.circulo;

import figurasgeometricas.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {

	private double raio;

	public void lerDados() {
		
		try {
			System.out.println("Digite o raio:");
			raio = lerTeclado.nextDouble();
		} catch (Exception e) {
			System.err.println("O dado foi inserido de forma errada, tente usar \",\" no lugar de \".\"");
		}
	}

	public void calcularArea() {
		// area = Math.PI * Math.pow(raio,2);
		area = Math.PI * raio * raio;
	}
}
