package cinema;

public class CompDeCompra {

	public static void main(String[] args) {
		
		Filme f1 = new Filme("Clarice Linda", "Fantasia", "'Em um lindo dia, uma garota resolve matar pessoas'", "www", 140, 18); 
		f1.status();
		
		Sessoes s1 = new Sessoes(5, "18:00", "Legendado");
		
		Datas dia = new Datas("Terça-Feira");
		
		Pagamento pag = new Pagamento(5056203158102570L, 897, "Compras", 2028, 71369852185L);
	}

}
