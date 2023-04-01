package cinema;

public class Sessoes {
	
	private int assentos, numMaxAss = assentos/2; //assentos com o numMax sendo metade dos assentos
	private String horarios[] = {"14:30", "18:00", "21:30"}, horarioEsc; //horários e a var horario escolhido
	private String tipo[] = {"Dublado", "Legendado"}, tipoEsc; //tipo dublado ou legendado e a vr de tipo escolhido
	
	public Sessoes(int assentos, String horarioEsc, String tipoEsc) { //construtor
		super();
		this.assentos = (escAssento(assentos));
		this.horarioEsc = (escHorario(horarioEsc));
		this.tipoEsc = (escTipo(tipoEsc));	
		//as variáveis recebem os métodos de escolha
	}
	
	public int escAssento(int assentos) {  //método de escolher o assento
		if(this.getAssentos() <= this.getNumMaxAss()) { //se o número de assentos for menor ou igual ao número máximo
			this.setAssentos(this.getAssentos());
			System.out.println("--------------------------------------------------------------");
			System.out.println("Assentos: " + this.getAssentos());  //ele atribui, se não, ele printa que atingiu o número máximo
		}else{
			System.out.println("Número máximo de assentos atingido!"); }
		return this.getAssentos();
	}

	
	public String escHorario(String horarioEsc) { //método de escolher o horário
		for(int i = 0; i < horarios.length; i++) {
		if(horarios[i].equals(horarioEsc)) {
			System.out.println("Horário: " + horarios[i]); }
		}
		return this.getHorarioEsc();
	}
	
	public String escTipo(String tipoEsc) { //método de escolher o tipo
		for(int i = 0; i < tipo.length; i++) {
		if(tipo[i].equals(tipoEsc)) {
			System.out.println("Tipo: " + tipo[i]); }
		}
		return this.getTipoEsc();
	}	

	public int getAssentos() {
		return assentos;
	}
	public void setAssentos(int assentos) {
		this.assentos = this.getAssentos();
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

	public String getHorarioEsc() {
		return horarioEsc;
	}
	public void setHorarioEsc(String horarioEsc) {
		this.horarioEsc = horarioEsc;
	}

	public String getTipoEsc() {
		return tipoEsc;
	}
	public void setTipoEsc(String tipoEsc) {
		this.tipoEsc = tipoEsc;
	}
}
