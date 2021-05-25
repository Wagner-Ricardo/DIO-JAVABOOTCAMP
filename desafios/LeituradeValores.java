package desafios;

import java.io.IOException;
import java.util.Scanner;

public class LeituradeValores {

	public static void main(String[] args) throws IOException {
		Scanner scan =  new Scanner(System.in);
		int quantidNumerosDigitados = 7;
		double valorPos = 0;
		
		for(int i=1; i < quantidNumerosDigitados; i++) {
			
			double valorDigitado = scan.nextDouble();

			if(valorDigitado > 0) {
				valorPos ++;
			}
			 
		}
		
		System.out.println( valorPos + " valores positivos");
		scan.close();
	     
	}

}
