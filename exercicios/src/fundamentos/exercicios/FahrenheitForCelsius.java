package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitForCelsius {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira os graus Fahrenheit: ");
		double F = entrada.nextDouble();
		
		double ajuste = 5.0/9.0;
		double conversao = (F - 32) * ajuste;
		System.out.println(F + "F�" + " Convertendo para Celsius fica: " + conversao + "�C");
		
		
		
		entrada.close();
	}

}
