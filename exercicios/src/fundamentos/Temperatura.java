package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (�F - 32) * 5/9 = �C
		
		double ajuste = 32;
		double multi = 5.0/9.0;
		double F = 86;
		
		double calculo = (F - ajuste) * multi;
		
		System.out.println("O resultiado � " + calculo + "�C.");
		
	}
}
