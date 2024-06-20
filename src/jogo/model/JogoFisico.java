package jogo.model;

public class JogoFisico extends Jogo {
	
	private String formato;

		public JogoFisico() {
		super();
	}
	public JogoFisico(String name, Double preço, String plataforma, String formato) {
		super(name, preço, plataforma);
		this.formato = formato;
	}
	
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
}
