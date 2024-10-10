package IfAndElse;

import java.util.Scanner;

public class RelembrandoIfAndElse {

	public static void main(String[] args) {
		
		// CHAMANDO CLASSE SCANNER PARA INTERAGIR COM O CONSOLE
		
		Scanner escrever = new Scanner(System.in);
		
		System.out.println("Bem vindo a auto escola flashcode");
		System.out.println("Digite o seu nome para cadastro");
		
		String nome = escrever.next();
		
		System.out.println("Digite sua idade:");

		int idade = escrever.nextInt();
		
		
		if (idade >=18) {
			System.out.println(nome + " , Você pode tirar sua Habilitação");
			
		} else {
			System.out.println(" Você não pode tirar sua habilitação");
			

		}
		
		

	}

}
