package fundamentos.desafios;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Trabalho na ter?a (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprarTv50 = trabalho1 && trabalho2;
		boolean comprarTv32 = trabalho1 ^ trabalho2;
		boolean tomarSorvete = comprarTv32 || comprarTv50;
		boolean saudavel = !tomarSorvete;
				
		System.out.println("Comprar TV50': " + comprarTv50);
		System.out.println("Comprar TV32': " + comprarTv32);
		System.out.println("Tomar sorvete: " + tomarSorvete);
		System.out.println("N?o tomou sorvete: " + saudavel);
	}
}
