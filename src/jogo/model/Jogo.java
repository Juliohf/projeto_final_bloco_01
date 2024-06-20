package jogo.model;

public abstract class Jogo {
	
	private Integer id;
	private String nome;
	private Integer tipo;
	private Double preço;
	private String plataforma;
	
	public Jogo() {
	}

	public Jogo(Integer id,String nome, Integer tipo, Double preço, String plataforma) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preço = preço;
		this.plataforma = plataforma;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
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
		
	public void visualizar() {

		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Jogo Fisico";
		break;
		case 2:
			tipo = "Jogo Digital";
		break;
		}
		

		System.out.println("Dados do jogo:");
		System.out.println("*********************************************************************");
		System.out.println("ID " + this.id);
		System.out.println("Nome " + this.nome);
		System.out.println("Preço " + this.preço);
		System.out.println("Plataforma " + this.plataforma);


	}
	
	
}
