package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusForFahrenheit {
	
	public static void main(String[] args) {		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira os graus Celsius: ");
		double C = entrada.nextDouble();
		
		double ajuste = 9.0/5.0;
		double conversao = C * ajuste + 32;
		System.out.println(C + "C?" + " Convertendo para Fahrenheit fica: " + conversao + "?F");
		
		
		
		entrada.close();
	}

}
