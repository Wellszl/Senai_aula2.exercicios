package Aula2;

import java.util.Scanner;

public class ProblemaAlt {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("---ALTURA MEDIA---");
		
		double alt1, alt2;
		String nome1, nome2;
		double media;
		
		System.out.println("insira aqui o nome da primeira pessoa: ");
		nome1 = sc.nextLine();
		System.out.println("Insira aqui a altura da primeira pessoa: ");
		alt1 = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("insira aqui o nome da segunda pessoa: ");
		nome2 = sc.nextLine();
		System.out.println("Insira aqui a alutura da segunda pessoa: ");
		alt2 = sc.nextDouble();
		
		
		media = (alt1 + alt2) / 2;
		
		System.out.println("a media dessas pessoas é igual a: " + media);
	}

}
