package Fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Consumidor consumidor = new Consumidor();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		consumidor.nome = scanner.nextLine();
		
		int num;
		do {
			System.out.print("Quantas compras foram realizadas: ");
			while (!scanner.hasNextInt()) {
				System.out.println("Valor inválido. Tente novamente");
				scanner.next();
			}
			num = scanner.nextInt();
		} while (num <= 0);

		
		consumidor.fiados = new int[num];
		
		for (int i = 0; i < consumidor.fiados.length; i++) {
			int compra = i + 1;
			System.out.print("Informe o valor da compra " + compra + ": ");
			while (!scanner.hasNextInt()) {
				System.out.println("Valor inválido. Tente Novamente para a compra " + compra + ": ");
				scanner.next();
			}
			consumidor.fiados[i] = scanner.nextInt();
		}
		
		int total = somaWhile(consumidor.fiados);
		
		if (total > 100) {
			System.out.println("Cliente " + consumidor.nome + " deve: " + total + " - ganhou brinde");
		} else {
			System.out.println("Cliente " + consumidor.nome + " deve: " + total);
		}
		
	}
	
	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}
		return total;
	}
	
	public static int somaFor(int[] fiados) {
		int total = 0;
		for (int i = 0; i < fiados.length; i++) {
			total += fiados[i];
		}
		return total;
	}
	
	public static int somaForeach(int[] fiados) {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}
	
}
