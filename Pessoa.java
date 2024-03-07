package br.unisinos;

// Estudantes: Maria Eduarda Borges e Pedro Quadros

public class Pessoa {

	private String nome;
	private int idade;
	private Enumeracao enumeracao;

	public Enumeracao getEnumeracao() {
		return enumeracao;
	}

	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "\n" + "Nome: " + nome + "\nIdade: " + idade;
	}
}