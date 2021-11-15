package partes;

public class parte2 {

	public static void main(String[] args) {
		double dado1= 0, dado2= 0, dado3= 0, dado4 = 0 , dado5 = 0, dado6 = 0;
		
		for (int i = 0; i <= 1000000 ; i++) {
			int valorDado = (int)(Math.random()*6) + 1;
			System.out.println(valorDado);
			if (valorDado == 1) {
				dado1 ++;
			} else if (valorDado == 2) {
				dado2 ++;
			}else if (valorDado == 3) {
				dado3 ++;
			}else if (valorDado == 4) {
				dado4 ++;
			}else if (valorDado == 5) {
				dado5 ++;
			}else if (valorDado == 6) {
				dado6 ++;
			}
			
			
		}
		System.out.println("O número 1 saiu "+ (dado1/10000)+"% das vezes");
		System.out.println("O número 2 saiu "+ (dado2/10000)+"% das vezes");
		System.out.println("O número 3 saiu "+ (dado3/10000)+"% das vezes");
		System.out.println("O número 4 saiu "+ (dado4/10000)+"% das vezes");
		System.out.println("O número 5 saiu "+ (dado5/10000)+"% das vezes");
		System.out.println("O número 6 saiu "+ (dado6/10000)+"% das vezes");
		
	}

}
