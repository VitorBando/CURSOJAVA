package fundamentos.desafios;

public class DesafioAritimeticos {
	
	public static void main(String[] args) {
		
		int a1 = 1 - 5;
		int a2 = 2 - 7;
		int a3 = a1 * a2;
		int a4 = a3 / 2;
		int a5 = (int) Math.pow(a4, 2);
	
		int b1 = 3 + 2;
		int b2 = b1 * 6;
		int b3 = (int) Math.pow(b2 , 2);
		int b4 = 3 * 2;
		int b5 = b3 / b4;
		
		int c1 = b5 - a5;
		int c2 = (int) Math.pow(c1, 3);
		int c3 = (int) Math.pow(10, 3);
		System.out.println("O resultado é: " + c2 / c3);
		
	}

}
