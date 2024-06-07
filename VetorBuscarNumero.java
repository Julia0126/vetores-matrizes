package exercicios;


import java.util.Scanner;

public class VetorBuscarNumero {
	public static void main(String[] args) {
		
		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.println("Vetor:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("\n");
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o número que você deseja encontrar: ");
		int numero = leia.nextInt();
		
		int posicao = -1;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				posicao = i;
				break;
			}
		}
		
		if (posicao != -1) {
			System.out.println("\nO número " + numero + " está localizado na posição: " + posicao);
		} else {
			System.out.println("\nO número " + numero + " não foi encontrado! :(");
		}
	}
}

