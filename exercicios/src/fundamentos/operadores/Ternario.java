package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 7.9;
		
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recupera??o";
		
		System.out.println("O aluno est? " + resultadoFinal);
		
		double nota = 8.0;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconto ? "Sim." : "N?o.";
		
		System.out.println("Tem desconto? " + resultado);
	}

}
