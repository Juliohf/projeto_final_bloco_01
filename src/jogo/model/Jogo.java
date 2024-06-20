package jogo.model;

public abstract class Jogo {
	
	private String name;
	private Double preço;
	private String plataforma;
	
	public Jogo() {
	}

	public Jogo(String name, Double preço, String plataforma) {
		this.name = name;
		this.preço = preço;
		this.plataforma = plataforma;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
		
}
