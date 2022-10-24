package figurasgeometricas.retangulo;

import figurasgeometricas.FiguraGeometrica;

public class Retangulo 
	extends FiguraGeometrica {

	public void lerDados() {
		System.out.println("Digite a base:");
		base = lerTeclado.nextDouble();
		System.out.println("Digite a altura:");
		altura = lerTeclado.nextDouble();
	}

	public void calcularArea() {
		area = base * altura;
	}

	
}
