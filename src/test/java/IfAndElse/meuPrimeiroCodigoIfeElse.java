package IfAndElse;

import java.util.Scanner;

public class meuPrimeiroCodigoIfeElse {

	public static void main(String[] args) {
		
	   //	Chamando classe escaner para interagir com o scanner
		
		Scanner escrever = new Scanner(System.in);
		
		System.out.println("Bem vindo a auto escola Flashcode");
		System.out.println("Digite seu nome para cadastro");
		
		String nome = escrever.next();
		System.out.println("Digie sua idade?");
		int idade = escrever.nextInt();
		
		if (idade >= 18) {
			System.out.println(nome + ",Você pode tirar a sua habilitação");
			
		} else {
			System.out.println(nome + ",Você não pode tirar sua Habilitação");
			

		}
		
		
		
		
		
		

	}

}
