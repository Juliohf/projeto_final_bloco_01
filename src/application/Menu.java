package application;

import java.util.Locale;
import java.util.Scanner;

import jogo.controller.JogoController;
import jogo.model.JogoDigital;
import jogo.model.JogoFisico;
import jogo.util.Cores;



public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		JogoController jogos = new JogoController();
	


		while (true) {

			System.out.println(Cores.TEXT_YELLOW_BRIGHT + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Levelup Games!	                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar novo jogo ao estoque       ");
			System.out.println("            2 - Visualizar estoque			         ");
			System.out.println("            3 - Buscar jogo por ID   				 ");
			System.out.println("            4 - Atualizar dados do jogo em estoque 	 ");
			System.out.println("            5 - Remover jogo do estoque            	 ");
			System.out.println("            6 - Sair                        		 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			int opcao = sc.nextInt();
			sc.nextLine();
			
			if (opcao == 6) {
				System.out.println("Até logo!");
				System.exit(0);
				sc.close();
			}
			
			switch(opcao) {
			
			case 1:
				System.out.println(Cores.TEXT_YELLOW_BRIGHT +"Adicionar novo jogo");
				System.out.println("------------------------------------");
				System.out.println("Digite o Nome do Jogo: ");
				String nome = sc.nextLine();
				
				System.out.println("Digite o Preço do jogo: ");
				double preço = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Digite a Plataforma do Jogo: ");
				String plataforma = sc.nextLine();
				 int tipo;
				do {
		            System.out.println("O jogo é do tipo Físico ou Digital? (Digite 1 para Físico e 2 para Digital)");
		            tipo = sc.nextInt();
		            sc.nextLine();

		        } while (tipo != 1 && tipo != 2);

		        switch (tipo) {
		            case 1:
		                System.out.println("Qual é o formato da mídia desse jogo?");
		                String formato = sc.nextLine();
		                jogos.CadastrarJogo(new JogoFisico(jogos.gerarId(), nome, tipo, preço, plataforma, formato));
		                break;
		            case 2:
		                System.out.println("Qual é o tamanho do jogo em gygabytes");
		                double tamanho = sc.nextDouble();
		                jogos.CadastrarJogo(new JogoDigital(jogos.gerarId(), nome, tipo, preço, plataforma, tamanho));
		                break;
		            default:
		                System.out.println("Opção inválida.");
		                break;
		        }					
				
				break;
			case 2:
				System.out.println(Cores.TEXT_YELLOW_BRIGHT +"Visualizar estoque");
				System.out.println("------------------------------------");
				jogos.listarEstoque();
				break;
				
			case 3:
				System.out.println(Cores.TEXT_YELLOW_BRIGHT +"Buscar jogo por Id:");
				System.out.println("------------------------------------");
				System.out.println("Digite a Id do Jogo:");
				int id = sc.nextInt();
				jogos.procurarPorId(id);				
				break;
				
			case 4:
				System.out.println(Cores.TEXT_YELLOW_BRIGHT +"Atualizar dados do jogo em estoque");
				
				System.out.println("Qual a Id do jogo que você quer atualizar?");
				id = sc.nextInt();
				sc.nextLine();
				var buscaJogo = jogos.buscarPorId(id);
				
				if(buscaJogo != null) {
					
					System.out.println("Digite o Nome do Jogo: ");
					nome = sc.nextLine();
					
					System.out.println("Digite o Preço do jogo: ");
					preço = sc.nextDouble();
					sc.nextLine();
					
					System.out.println("Digite a Plataforma do Jogo: ");
					plataforma = sc.nextLine();
					
					 		 
				     System.out.println("O jogo é do tipo Físico ou Digital? (Digite 1 para Físico e 2 para Digital)");
				     tipo = buscaJogo.getTipo();

			        if (tipo == 1) {
			                System.out.println("Qual é o formato da mídia desse jogo?");
			                String formato = sc.nextLine();
			                jogos.atualizarJogo(new JogoFisico(id, nome, tipo, preço, plataforma, formato));
			        } if (tipo == 2) {			            
			                System.out.println("Qual é o tamanho do jogo em gygabytes");
			                double tamanho = sc.nextDouble();
			                jogos.CadastrarJogo(new JogoDigital(id, nome, tipo, preço, plataforma, tamanho));
			        } else {
			        	System.out.println("Tipo de jogo inválido.");
			        }
			        }					

			case 5:
				System.out.println(Cores.TEXT_YELLOW_BRIGHT +"Remover jogo do estoque:");
				System.out.println("------------------------------------");
				System.out.println("Digite a Id do jogo:");
				id = sc.nextInt();
				jogos.deletar(id);
				
				break;
			case 6:
				System.out.println(Cores.TEXT_YELLOW_BRIGHT +"Sair");
				break;
			default:
				System.out.println(Cores.TEXT_YELLOW_BRIGHT +"Opção invalida!");
				break;
			}

			
		} 
	
		

	}

}
