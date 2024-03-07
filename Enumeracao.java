package br.unisinos;

// Estudantes: Maria Eduarda Borges e Pedro Quadros

public enum Enumeracao {
	
// Listagem das pessoas para utilizar como teste:
	
    CAROLINA("Carolina",1, 25),
    ANA("Ana",2, 30),
    LAURA("Laura",3, 18),
    LOUISE("Louise",4, 12),
    ROBERTO("Roberto",5, 35),
    LUANA("Luana",6, 36),
    CARLOS("Carlos",7, 32),
    JOANA("Joana",8, 19),
    IVAN("Ivan",9, 40),
    FERNANDA("Fernanda",10, 17),
    BRUNO("Bruno",11, 21),
    VANESSA("Vanessa",12, 31),
    GILBERTO("Gilberto",13, 20),
    RENATA("Renata",14, 64),
    LUIZ("Luiz",15, 18),
    LUCAS("Lucas",16, 56),
    MARTA("Marta",17, 39),
    GABRIEL("Gabriel",18, 14),
    BRENO("Breno",19, 21),
    PIETRA("Pietra",20, 30),
    FELIPE("Felipe",21, 12),
    RODRIGO("Rodrigo",22, 68),
    VALENTINA("Valentina",23, 37),
    DANIEL("Daniel",24, 25),
    RAFAEL("Rafael",25, 19),
    ALICE("Alice",26, 26),
    GUSTAVO("Gustavo",27, 33),
    THIAGO("Thiago",28, 70),
    MARIANE("Mariane",29, 15),
    LUIZA("Luiza",30, 28),
    RICARDO("Ricardo",31, 44);

    private final int id;
    private final int idade;
    private final String nome;

    Enumeracao(String nome, int id, int idade) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getNome() {
    	return nome;
    }
    
}