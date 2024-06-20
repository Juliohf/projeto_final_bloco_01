package jogo.controller;

import java.util.ArrayList;

import jogo.model.Jogo;
import jogo.repository.JogoRepository;

public class JogoController implements JogoRepository {
	
	private ArrayList<Jogo> listaJogos = new ArrayList<>();
	int id = 0;

	@Override
	public void listarEstoque() {
		for (var jogo : listaJogos) {
			jogo.visualizar();
		}
		
	}

	@Override
	public void CadastrarJogo(Jogo jogo) {
		listaJogos.add(jogo);
		System.out.println("O jogo " + jogo.getnome() + " foi adicionado com sucesso!");
		
	}

	@Override
	public void atualizarJogo(Jogo jogo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarId() {
		return ++ id;
	}

}
