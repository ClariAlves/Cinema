package cinema;

public class Sessoes {
	
	private int assentos[] = new int[50], numMaxAss = 25;
	private String horarios[] = {"14:30", "18:00", "21:30"};
	private String tipo[] = {"Dublado", "Legendado"};
	
	public Sessoes(int assentos, String horarios, String tipo) {
		super();
		this.setAssentos(escAssento());
		this.setHorarios(escHorario());
		this.setTipo(escTipo());	
	}
	
	public void status() {
		System.out.println("Assentos: " + this.getAssentos() + "\nHorário: " + this.getHorarios() +
				"\nTipo: " + this.getTipo());
		System.out.println("--------------------------------------------------------------");
	}
	
	public int escAssento() {
		if(this.getAssentos() <= numMaxAss) {
			this.setAssentos(this.getAssentos());
		}else{
			System.out.println("Número máximo de assentos atingido!"); }
		return this.getAssentos();
	}

	
	public String[] escHorario() {
		if(horarios[0] == "14:30" || horarios[0] == "18:00" || horarios[0] == "21:30") {
			this.setHorarios(this.getHorarios());
		}else {
			System.out.println("Horário indisponível!"); }
		
		return this.getHorarios();
	}
	
	public String[] escTipo() {
		if(tipo[0] == "Dublado"){ this.setTipo(this.getTipo());
		}else if(tipo[0] == "Legendado"){ this.setTipo(this.getTipo());
		}else{ System.out.println("Tipo inválido"); }
		
		return this.getTipo();
	}

	public int getAssentos() {
		return assentos[0];
	}
	public void setAssentos(int assentos) {
		this.assentos[0] = this.getAssentos();
	}


	public int getNumMaxAss() {
		return numMaxAss;
	}
	public void setNumMaxAss(int numMaxAss) {
		this.numMaxAss = numMaxAss;
	}


	public String[] getHorarios() {
		return horarios;
	}
	public void setHorarios(String[] horarios) {
		this.horarios = horarios;
	}


	public String[] getTipo() {
		return tipo;
	}
	public void setTipo(String[] tipo) {
		this.tipo = tipo;
	}

}
