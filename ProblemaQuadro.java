package Aula2;

import java.util.Scanner;

public class ProblemaQuadro {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
		
		
		double largura;
		double altura;
		double area;
		double perimetro;
		double diagonal;
		
		System.out.println("Digite a largura do quadro: ");
		largura = sc.nextDouble ();
		System.out.println("Digite a altura do qaudro: ");
		altura = sc.nextDouble ();
		
		area = largura * altura;
		System.out.println("A area do quadro é: " + String.format("%.4f", area));
		area = sc.nextDouble();
		
		perimetro = 2 * (largura + altura);

	}

}
