package Fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		
		System.out.print("Por favor, informe o telefone para contato: ");
		String telefone = scanner.nextLine();
		
		int num;
		do {
			System.out.print("Quantas compras foram realizadas: ");
			while (!scanner.hasNextInt()) {
				System.out.println("Valor inválido. Tente novamente");
				scanner.next();
			}
			num = scanner.nextInt();
		} while (num <= 0);

		Consumidor consumidor = new Consumidor(nome, num, telefone);
		
		for (int i = 0; i < num; i++) {
			int compra = i + 1;
			System.out.print("Informe o valor da compra " + compra + ": ");
			while (!scanner.hasNextInt()) {
				System.out.println("Valor inválido. Tente Novamente para a compra " + compra + ": ");
				scanner.next();
			}
			int fiado = scanner.nextInt();
			consumidor.registrarFiado(fiado);
		}
		
		scanner.close();
		
		int total = consumidor.getFiado();
		
		if (total > 100) {
			System.out.println("Cliente " + consumidor.getNome() + " (Telefone: " + consumidor.getTel() + ") deve: " + total);
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
