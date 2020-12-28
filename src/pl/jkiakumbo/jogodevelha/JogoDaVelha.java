package pl.jkiakumbo.jogodevelha;

public class JogoDaVelha {

	public static void main(String[] args) {
		int test[][] = {{-1,0,0},{0,1,-1},{0,-1,1}};
		Tabuleiro ta = new Tabuleiro(test);
		System.out.println("\nStep 1");
		ta.mostrarTabela();
		int t [] = {0,2};
		int j = 1;
		System.out.println("\nStep 2");
		ta.setPosicao(t, j);
	}

}
