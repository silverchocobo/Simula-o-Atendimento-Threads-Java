package br.unisinos;

// Estudantes: Maria Eduarda Borges e Pedro Quadros

public class TarefaAtendimento implements Runnable {
	
	
	private static final int TEMPO_MAXIMO_ATENDIMENTO = 6000;

	private Fila fila;
	
	
	public TarefaAtendimento(Fila fila) {
		this.fila = fila;
		
	}
	@Override
	public void run() {
		try {
							
				while (!fila.isEmpty()) {
					Thread.sleep((long) (Math.random() * TEMPO_MAXIMO_ATENDIMENTO));
					fila.remove(); 	
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	

}
