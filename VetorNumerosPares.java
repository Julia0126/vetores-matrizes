package exercicios;


import java.util.Scanner;

public class VetorNumerosPares {
	public static void main(String[] args) {
		// Inicialização do vetor para armazenar os números
		int[] vetor = new int[10];

		// Leitura dos números fornecidos pelo usuário e armazenamento no vetor
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite 10 números inteiros:");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = leia.nextInt();

		}

		// Exibição dos elementos nos índices ímpares do vetor
		System.out.println("\nElementos nos índices ímpares:");
		for (int i = 1; i < vetor.length; i += 2) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("\n");

		// Exibição dos elementos pares do vetor
		System.out.println("Elementos pares:");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.println("\n");

		// Cálculo da soma de todos os elementos do vetor
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.println("Soma: " + soma + "\n");

		// Cálculo da média de todos os elementos do vetor
		double media = (double) soma / vetor.length;
		System.out.println("Média: " + String.format("%.2f", media));
		leia.close();
	}


}
