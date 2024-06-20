package jogo.repository;

import jogo.model.Jogo;

public interface JogoRepository {
	
	public void listarEstoque();
	public void CadastrarJogo(Jogo jogo);
	public void atualizarJogo(Jogo jogo);
	public void deletar(Integer id);
	public void procurarPorId(Integer id);
	

}
