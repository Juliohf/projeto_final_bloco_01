package application;

import java.util.Locale;
import java.util.Scanner;
import jogo.util.Cores;



public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		


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
			
			if (opcao == 6) {
				System.out.println("Até logo!");
				System.exit(0);
				sc.close();
			}
			
			switch(opcao) {
			
			case 1:
				System.out.println(Cores.TEXT_YELLOW_BRIGHT +"Adicionar novo jogo");
				break;
			case 2:
				System.out.println(Cores.TEXT_YELLOW_BRIGHT +"Visualizar estoque");
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
