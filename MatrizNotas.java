package exercicios;

	import java.util.Scanner;

	public class MatrizNotas {
	    public static void main(String[] args) {
	        
	        double[][] notas = new double[10][4];
	        
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Digite as notas do participante " + (i + 1) + ":");
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Nota do " + (j + 1) + "º bimestre: ");
	                notas[i][j] = scanner.nextDouble();
	            }
	        }
	        
	        double[] medias = new double[10];
	        for (int i = 0; i < 10; i++) {
	            double soma = 0;
	            for (int j = 0; j < 4; j++) {
	                soma += notas[i][j];
	            }
	            medias[i] = soma / 4;
	        }
	        
	        System.out.println("\nMédias de cada participante:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
	        }
	    }
	}