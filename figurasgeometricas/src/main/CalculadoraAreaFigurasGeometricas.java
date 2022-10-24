package main;

import java.util.HashMap;
import java.util.Scanner;

import figurasgeometricas.FiguraGeometrica;
import figurasgeometricas.circulo.Circulo;
import figurasgeometricas.losango.Losango;
import figurasgeometricas.quadrado.Quadrado;
import figurasgeometricas.retangulo.Retangulo;
import figurasgeometricas.triangulo.Triangulo;

public class CalculadoraAreaFigurasGeometricas {

	private static final int CIRCULO = 1;
	private static final int QUADRADO = 2;
	private static final int RETANGULO = 3;
	private static final int LOSANGO = 4;
	private static final int TRIANGULO = 5;

	private HashMap<Integer, FiguraGeometrica> figurasOpcoes;

	public CalculadoraAreaFigurasGeometricas() {
		figurasOpcoes = new HashMap<>();
		figurasOpcoes.put(CIRCULO, new Circulo());
		figurasOpcoes.put(QUADRADO, new Quadrado());
		figurasOpcoes.put(RETANGULO, new Retangulo());
		figurasOpcoes.put(LOSANGO, new Losango());
		figurasOpcoes.put(TRIANGULO, new Triangulo());
	}

	public static void main(String[] args) {
		new CalculadoraAreaFigurasGeometricas().executar();
	}

	private void executar() {

		Scanner lerTeclado = new Scanner(System.in);

		int escolhaDoUsuario = 0;

		System.out.println(CIRCULO + " - Circulo");
		System.out.println(QUADRADO + " - Quadrado");
		System.out.println(RETANGULO + " - Retangulo");
		System.out.println(LOSANGO + " - Losango");
		System.out.println(TRIANGULO + "- Triangulo");
		System.out.println("9 - Sair");

		escolhaDoUsuario = lerTeclado.nextInt();

		try {
			FiguraGeometrica figura = figurasOpcoes.get(escolhaDoUsuario);
			figura.setLerTeclado(lerTeclado);
			figura.lerDados();
			figura.calcularArea();
			figura.mostrarResultado();
			System.out.println("Recomeçando...");
			try {
		        Thread.sleep((long) (2500));
		    } catch (InterruptedException e) {}
			
			executar();		
		} catch (Exception exception) {
			System.exit(0);
		}
	}
}
