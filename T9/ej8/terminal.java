package ej8;

public class terminal {
		private String numero;
		private int duracion;
		
		
		//constructor
		public terminal(String numero){
			this.numero=numero;
			this.duracion=0;
		}
		
		
		//instancias
		public void llama(terminal t, int tiempo){
			this.setDuracion(this.getDuracion()+tiempo);
			t.setDuracion(t.getDuracion()+tiempo);
		}
		
		
		//Getter y setter
		
		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public int getDuracion() {
			return duracion;
		}

		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}


		@Override
		public String toString() {
			return "Nº "+numero+" - "+ duracion + "s de conversacion ";
		}
		
		
		
		
}
