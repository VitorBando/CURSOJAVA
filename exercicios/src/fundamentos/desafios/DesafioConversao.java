package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro sal�rio:");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite seu segundo sal�rio:");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite seu terceiro sal�rio:");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double val1 = Double.parseDouble(salario1);
		double val2 = Double.parseDouble(salario2);
		double val3 = Double.parseDouble(salario3);
		
		double soma = val1 + val2 + val3;
		
		double media = soma / 3;
				
		System.out.println("A m�dia dos salarios �: " + media);
		
		entrada.close();
	}

}
