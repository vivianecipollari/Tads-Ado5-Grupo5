package partes;

import java.util.Scanner;

public class parte1 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int i = 0;
	        boolean sair = true;
	        System.out.println("Questão 1 - Leia atentamente o trecho de Diehl e Tatim (2004, p. 25):\n" +
	        		"Preservar a liberdade na ciência e lutar por ela, por mais individualista que possa parecer, é a condição sine qua non ao conhecimento, pois a ciência vincula-se diretamente ao espírito da tragédia, aqui vista como a consciência do limite e de sua ruptura. Romper o limite é a própria tragédia: o desconhecido, o irracional para alguns. Como cientistas, trabalhamos sempre no limite, ou melhor, trabalhamos para rompê-lo e conseguir explicar a natureza, essa desconhecida.\n" +
	        		"Por que, segundo os autores, a tarefa do cientista é trágica? ");
	        		        System.out.println("Alternativas: \n (A) Ela é trágica porque todas as pessoas que se prezem deveriam ser cientistas, mas muitas não têm competência para isso. \n (B) Ela é trágica porque o conhecimento científico nunca pode ser alcançado em sua totalidade, sendo que sempre se tem mais descobertas para fazer. \n (C) Ela é trágica por causa da perseguição política pelos dirigentes dos governos, que costumam ver nos cientistas uma ameaça ao seu poder, pois, como diz o dito popular, saber é poder. \n (D) Ela é trágica porque a maioria das pessoas é analfabeta em termos de ciência e, com isso, os cientistas vivem isolados, não têm com quem conversar e são incompreendidos por toda a sociedade. \n (E) Nenhuma das opções acima. \n");
	        		        
	        
	        do {
	        	
	        	System.out.printf("Voce possui %s chances%n",  3 - i);
	        	char opcao = sc.next().charAt(0);
	        switch (opcao) {
	            case 'A':
	            case 'a':
	            case 'C':
	            case 'c':
	            case 'D':
	            case 'd':
	            case 'E':
	            case 'e':
	                System.out.println("Resposta errada.");
	                System.out.println("Tente novamente");
	                break;
	            case 'B':
	            case 'b':
	                System.out.println("Resposta correta!");
	                sair = false; 
	                break;
	            default:
	                System.out.printf("Opção inválida.%n Voce possui %s chances%n", 3 - i);
	                break;
	        }
	        i++;
	        if (i == 3) {
	        	System.out.println("Voce errou todas as tentativas!");
	        }
	        }while(sair && i < 3); 
	        sc.close();
	    }

}
