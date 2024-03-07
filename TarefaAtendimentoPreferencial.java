package br.unisinos;

public class TarefaAtendimentoPreferencial implements Runnable {
	
	
	private static final int TEMPO_MAXIMO_ATENDIMENTO = 6000;

	private Fila fila;
	private Fila filaPreferencial;
	
	
	public TarefaAtendimentoPreferencial(Fila fila, Fila filaPreferencial) {
		this.fila = fila;
		this.filaPreferencial = filaPreferencial;
		
	}
	@Override
	public void run() {
		try {
						
				while (!filaPreferencial.isEmpty()) {
					Thread.sleep((long) (Math.random() * TEMPO_MAXIMO_ATENDIMENTO));
					filaPreferencial.remove(); 	
				
			}
				while(!fila.isEmpty()) {
					Thread.sleep((long) (Math.random() * TEMPO_MAXIMO_ATENDIMENTO));
					fila.remove(); 	
				}
				
				
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	} 
}


