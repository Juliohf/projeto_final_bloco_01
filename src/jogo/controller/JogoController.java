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
		var buscaJogo = buscarPorId(jogo.getId());
		if (buscaJogo != null) {
			listaJogos.set(listaJogos.indexOf(buscaJogo), jogo);
			System.out.println("O jogo com Id " + jogo.getId() + " foi atualizado com sucesso!");
		}else {
			System.out.println("O jogo com Id " + jogo.getId() + " não foi encontrado!");
		}
		
	}
	
	public void procurarPorId(Integer id) {
		var jogo = buscarPorId(id);
		
		if(jogo != null) {
			jogo.visualizar();
			
		}else {
			System.out.println("Jogo Id: " + id + " não foi encontrado!");
		}
	}

	@Override
	public void deletar(Integer id) {
		var jogo = buscarPorId(id);
		
		if (jogo != null) {
			if (listaJogos.remove(jogo) == true) {
				System.out.println("O jogo " + jogo.getnome() + " foi deletado com sucesso!");
			}else {
				System.out.println("O jogo Não foi encontrado!");
			}
		}

	}
	
	public int gerarId() {
		return ++ id;
	}
	
	public Jogo buscarPorId(int id) {
		for (var jogo : listaJogos) {
			if (jogo.getId() == id) {
				return jogo;
			}
		}
		return null;
	}

}
