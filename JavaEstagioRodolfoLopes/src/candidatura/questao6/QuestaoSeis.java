package candidatura.questao6;

public abstract class QuestaoSeis {
	
		public static int valorParaTodas;
		private static int valor = 0;
		
		public static int getValorParaTodas() {
			return valorParaTodas;
		}

		public static void setValorParaTodas(int valorParaTodas) {
			QuestaoSeis.valorParaTodas = valorParaTodas;
		}


		public QuestaoSeis(int valor) {
			super();
			this.valor = valor;
		}

		public abstract void meExtenda();
		
		
		
		
		
		
		
		
		
		
		
	
	
}
