package partes;

import java.util.Scanner;

public class parte1 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int i = 0;
	        boolean sair = true;
	        System.out.println("Quest�o 1 - Leia atentamente o trecho de Diehl e Tatim (2004, p. 25):\n" +
	        		"Preservar a liberdade na ci�ncia e lutar por ela, por mais individualista que possa parecer, � a condi��o sine qua non ao conhecimento, pois a ci�ncia vincula-se diretamente ao esp�rito da trag�dia, aqui vista como a consci�ncia do limite e de sua ruptura. Romper o limite � a pr�pria trag�dia: o desconhecido, o irracional para alguns. Como cientistas, trabalhamos sempre no limite, ou melhor, trabalhamos para romp�-lo e conseguir explicar a natureza, essa desconhecida.\n" +
	        		"Por que, segundo os autores, a tarefa do cientista � tr�gica? ");
	        		        System.out.println("Alternativas: \n (A) Ela � tr�gica porque todas as pessoas que se prezem deveriam ser cientistas, mas muitas n�o t�m compet�ncia para isso. \n (B) Ela � tr�gica porque o conhecimento cient�fico nunca pode ser alcan�ado em sua totalidade, sendo que sempre se tem mais descobertas para fazer. \n (C) Ela � tr�gica por causa da persegui��o pol�tica pelos dirigentes dos governos, que costumam ver nos cientistas uma amea�a ao seu poder, pois, como diz o dito popular, saber � poder. \n (D) Ela � tr�gica porque a maioria das pessoas � analfabeta em termos de ci�ncia e, com isso, os cientistas vivem isolados, n�o t�m com quem conversar e s�o incompreendidos por toda a sociedade. \n (E) Nenhuma das op��es acima. \n");
	        		        
	        
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
	                System.out.printf("Op��o inv�lida.%n Voce possui %s chances%n", 3 - i);
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
