package partes;
import java.util.Scanner;
import java.util.Random;



public class parte3 {
	public static void main(String[] args) {
		
            Scanner entrada = new Scanner(System.in);
	Random aleatorio = new Random();
		
        
        
        System.out.println("*****ADIVINHE O NÚMERO****");
        
        boolean acertou = false;
	int numeroAleatorio = aleatorio.nextInt(100);
	int palpite = 1;
	int tentativas = 5;
        System.out.println(numeroAleatorio);
        
        while(tentativas>=0 &&acertou==false){
            System.out.println("Chute um numero de 1 a 100  ");
            palpite = entrada.nextInt();
            
            if (numeroAleatorio==palpite){
                System.out.println("Parabéns!!!!!Vc ganhou o Jogo!");
                 acertou=true;                                                                                     
            } else if  (palpite == numeroAleatorio-1|| palpite== numeroAleatorio+1){  
              
                System.out.println("Tá Quente!!!!! vc tem mais  "+ tentativas-- +" chances"); 
            } else{
                System.out.println("Errou, vc tem mais "+tentativas-- +" chances");
             
            }if(tentativas== 0){ 
                System.out.println("Vc só tem mais uma tentativa");
            
            }if(tentativas== -1){
                System.out.println("Acabou suas chances. Game over!!!!");
                
                
            }
            
    } 
            
 }  
} 
            
            
            
	

