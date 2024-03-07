package br.unisinos;

// Estudantes: Maria Eduarda Borges e Pedro Quadros

import java.util.Scanner;

public class FilaTeste {

	public static void main(String[] args) {

		// Apresentação inicial do sistema:

		System.out.println(
				"❤ Bem-vindo ao Sistema de Gerenciamento de Compra de Ingressos para o Show da Taylor Swift ❤\n");

		Scanner scanner = new Scanner(System.in);

		Fila filaComum = new Fila();
		Fila filaPreferencial = new Fila();

		filaComum.inserirPessoas();
		filaPreferencial.inserirPessoasPreferencial();


		int resposta;

		do {

			// Exibe as opções para o usuário:

			System.out.println("O que você deseja realizar?\n");
			System.out.println("1 - Visualizar a fila\n");
			System.out.println("2 - Iniciar atendimento\n");
			System.out.println("3 - Sair do programa\n");

			resposta = scanner.nextInt();

			switch (resposta) {

			case 1:
				if (!filaComum.isEmpty() & !filaPreferencial.isEmpty()) {
					System.out.println("\nFila preferencial: ");
					filaPreferencial.imprimirFila();
					System.out.println("\nFila comum:");
					filaComum.imprimirFila();
					break;
				}
				else {
					System.out.println("As filas estão vazias! ");
				}

			case 2:

				Thread atendimento1 = new Thread(new TarefaAtendimento(filaComum));
				atendimento1.setName("Caixa 1");
				Thread atendimento2 = new Thread(new TarefaAtendimento(filaComum));
				atendimento2.setName("Caixa 2");
				Thread preferencial = new Thread(new TarefaAtendimentoPreferencial(filaComum, filaPreferencial));
				preferencial.setName("Caixa Preferencial");

				try {
					atendimento1.start();
					atendimento2.start();
					preferencial.start();

					atendimento1.join();
					atendimento2.join();
					preferencial.join();

				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.println("\nFim da execução.");
				
				break;

			case 3:
				System.out.println("\nObrigado por usar o sistema. Até mais!\n");
				System.exit(0);
				break;

			default:
				System.out.println("\nOpção inválida. Tente novamente.");
				break;
			}

		} while (resposta != 3);

		scanner.close();

	}
}