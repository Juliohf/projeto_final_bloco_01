package jogo.model;

public class JogoFisico extends Jogo {
	
	private String formato;

		public JogoFisico() {
		super();
	}
	public JogoFisico(Integer id, String nome,Integer tipo, Double preço, String plataforma, String formato) {
		super(id, nome, tipo, preço, plataforma);
		this.formato = formato;
	}
	
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
}
