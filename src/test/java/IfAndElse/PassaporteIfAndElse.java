package IfAndElse;

import java.util.Scanner;

public class PassaporteIfAndElse {

	public static void main(String[] args) {
		
		Scanner escrever = new Scanner(System.in);
		
		System.out.println("Bem vindo a Receita Federal");
		
		System.out.println("Nome completo:");
				
		

		String nome = escrever.next();
		System.out.println("Digite sua idade");
		int idade = escrever.nextInt();
		if (idade >=23) {
			System.out.println(nome +", Você pode tirar seu passaporte, preencha os dados a baixo:");
			
			
		} else {
			System.out.println(nome +", Você não pode tirar seu passaporte.");

		}
		
		
		
		
		System.out.println("CPF:");

		 	
		String cpf = escrever.next();
		
		System.out.println("Endereço:");
		
		String endereco = escrever.next();
		
		System.out.println("Cidade:");
		
		String cidade = escrever.next();
		
		if (idade >=23) {
			
			
			
		} else {
			System.out.println(nome +", Você não pode tirar seu passaporte.");

		}
		
		
		
		
		
				
		

	}

}
