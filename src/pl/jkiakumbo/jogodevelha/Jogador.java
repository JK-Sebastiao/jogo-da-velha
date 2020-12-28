package pl.jkiakumbo.jogodevelha;

public abstract class Jogador {
	protected int[] tentativa = new int[2];
	protected int jogador;
	
	public Jogador(int jogador) {
		this.jogador = jogador;
	}
	
	public abstract void jogar(Tabuleiro tabuleiro);
	
	public abstract void tentar(Tabuleiro tabuleiro);
	
	public boolean verificarCelula(int[] celulaEscolida,Tabuleiro tabuleiro) {
		return tabuleiro.getPosicao(celulaEscolida) == 0;
	}

}
//t = [0,2]