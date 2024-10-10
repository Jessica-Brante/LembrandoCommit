package meuPrimeiroIf;

import java.util.Scanner;

public class ExercicioIfANdElse {

	public static void main(String[] args) {
		
		Scanner escrever = new Scanner(System.in);
		
		System.out.println("Bem vindo a Receita Federal");
		System.out.println("Digite seu nome completo:");
		
		String nome = escrever.next();
		
		System.out.println("Digite sua Idade");
		
		int idade = escrever.nextInt();
		
		if (idade>=23) {
			System.out.println( nome + " ,Você pode tiarar seu passaporte."); 
			
		} else {
			System.out.println( nome + " ,Você não pode tiarar seu passaporte.");

		}
		
		
		System.out.println("Digite seu CPF para continuar o casatro:");
		
		String cpf = escrever.next();
		
		
		System.out.println("Digite seu Endereço:");
		
		String endereco = escrever.next();
		
		
		System.out.println("Digite sua Cidade:");
		
		String cidade = escrever.next();
		
		
		
		
	}

}
