package figurasgeometricas.circulo;

import figurasgeometricas.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {

	private double raio;

	public void lerDados() {
		System.out.println("Digite o raio:");
		raio = lerTeclado.nextDouble();	
	}

	public void calcularArea() {
		// area = Math.PI * Math.pow(raio,2);
		area = Math.PI * raio * raio;
	}
}
