package cinema;

public class Datas {
	
	private String datas[] = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira" + 
								"Sábado", "Domingo"};
	private String escolha;
	private int preco;
	
	
	public Datas(String escolha) {
		super();
		this.escolha = escData(escolha);
	}
	
	/*public void status() {
		System.out.println("Data: " + this.getEscolha());
		System.out.println("--------------------------------------------------------------");
	}
	*/

	public String escData(String escolha) {
		for(int i = 0; i < datas.length; i++) {
			if(datas[i].equals(escolha)) {
				System.out.println("Data: "+ datas[i]); }
	  }
		return this.getEscolha();
	}
	
	public String[] getDatas() {
		return datas;
	}
	public void setDatas(String[] datas) {
		this.datas = datas;
	}
	
	public String getEscolha() {
		return escolha;
	}
	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}
	
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
}
