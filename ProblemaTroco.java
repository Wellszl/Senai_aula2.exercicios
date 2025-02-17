package Aula2;

import java.util.Scanner;

public class ProblemaTroco {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	double produto;
	double quantidade;
	double valor;
	double recebido;
	double troco;
	
	produto = 8;
	
	System.out.println("Bom dia!!");
	System.out.println("esse produto custa 8BRL, quantos vc vai querer");
	quantidade = sc.nextDouble();
	
	valor = produto * quantidade;
	System.out.println("ok, ficou: " + valor);
	System.out.println("quanto vc tem?");
	recebido= sc.nextDouble();
	
	troco = recebido - valor;
	
	System.out.println("seu troco ficou " + String.format("%.2f", troco));
	}

}
