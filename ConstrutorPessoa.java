package Aula_22_10_2026;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		
		Pessoa jogador1 = new Pessoa("Ronaldo", 50);
		Pessoa jogador2 = new Pessoa ("Messi", 36);
		
		System.out.println(jogador2.getNome ());
		System.out.println(jogador2.getIdade());
		
		System.out.println(jogador1.getNome ());
		System.out.println(jogador1.getIdade());
		
		jogador1.setNome("Ronaldo");
		jogador1.setIdade(50);
		
		

	}

}
