package Aula2;

import java.util.Scanner;

public class ProblemaPiso {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		
		double largura;
		double comprimento;
		double m2;
		double area;
		double total;
		
		System.out.println("Digite a largura do cômodo:");
		largura = sc.nextDouble ();
		System.out.println("Digite o comprimento do cômodo:");
		comprimento = sc.nextDouble ();
		System.out.println("Digite o valor do M² do piso:");
		m2 = sc.nextDouble();
		
		area = largura * comprimento;
		System.out.println("A area do piso é: " + String.format("%.2f", area));
		
		total = m2 * area;
		System.out.println("o valor do piso é: " + String.format("%.2f", total));
		

	}

}
