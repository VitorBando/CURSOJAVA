package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoImc {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		double kg = entrada.nextDouble();
		
		System.out.println("Digite sua altura:");
		double cm = entrada.nextDouble();
		
		double imc = (kg / Math.pow(cm, 2));
		
		System.out.println("Imc ? de: " + imc);
		
		entrada.close();
				
	}

}
