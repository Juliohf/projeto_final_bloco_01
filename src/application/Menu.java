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
			System.out.println("            3 - Editar jogo do estoque 				 ");
			System.out.println("            4 - Remover jogo do estoque            	 ");
			System.out.println("            5 - Sair                        		 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			int opcao = sc.nextInt();
			sc.nextLine();
			
			if (opcao == 5) {
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
		                System.out.println("Qual é o tamanho da mídia desse jogo?");
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
				jogos.listarEstoque();
				break;
			case 3:
				System.out.println(Cores.TEXT_YELLOW_BRIGHT +"Editar jogo do estoque");
				break;
			case 4:
				System.out.println(Cores.TEXT_YELLOW_BRIGHT +"Remover jogo do estoque");
				break;
			case 5:
				System.out.println(Cores.TEXT_YELLOW_BRIGHT +"Sair");
				break;
			default:
				System.out.println(Cores.TEXT_YELLOW_BRIGHT +"Opção invalida!");
				break;
			}

			
		} 
	
		

	}

}
