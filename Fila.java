package br.unisinos;

// Estudantes: Maria Eduarda Borges e Pedro Quadros

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Fila {

	private Queue<Pessoa> fila;

	public Fila() {
		this.fila = new LinkedBlockingQueue<Pessoa>();

	}

	public synchronized void remove() {
		if (!fila.isEmpty()) {
			System.out.println(fila.peek().getNome() + " saiu da fila para ser atendido");
			System.out.println("\nAtendendo agora: " + fila.peek() + "\nNo caixa: " + Thread.currentThread().getName());
			System.out.println(
					"\n" + fila.poll().getNome() + " terminou de ser atendido no " + Thread.currentThread().getName());
		}

	}

	public void imprimirFila() {
		for (Pessoa pessoa : fila) {
			System.out.println(pessoa.getNome());
		}
	}

	public void inserirPessoas() {
		Enumeracao[] enumeracao = Enumeracao.values();

		for (int i = 0; i < 30; i++) {

			if (enumeracao[i].getIdade() < 60) {

				fila.add(new Pessoa(enumeracao[i].getNome(), enumeracao[i].getIdade()));
			}
		}
	}

	public void inserirPessoasPreferencial() {
		Enumeracao[] enumeracao = Enumeracao.values();

		for (int i = 0; i < 30; i++) {

			if (enumeracao[i].getIdade() >= 60) {

				fila.add(new Pessoa(enumeracao[i].getNome(), enumeracao[i].getIdade()));

			}

		}
	}

	public int size() {
		return fila.size();
	}

	public boolean isEmpty() {
		return (size() == 0);
	}

}
