package jogo.model;

public class JogoDigital extends Jogo {
	
	private double tamanho;

	public JogoDigital() {
		super();
	}
	
	public JogoDigital(String name, Double preço, String plataforma, double tamanho) {
		super(name, preço, plataforma);
		this.tamanho = tamanho;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
}
