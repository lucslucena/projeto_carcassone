package br.ufpb.dcx.aps.carcassone;


public class Jogador{

	private Cor jogador;
	private int pontosJogador = 0;
	private int id;
	private int meeplesJogador = 7;
	
	public Jogador(Cor cor) {
		// TODO Auto-generated constructor stub
		jogador =cor;
	}
	
	public Jogador(int id, Cor jogador, int pontosJogador, int meeplesJogador) {
		this.id = id;
		this.jogador = jogador;
		this.pontosJogador = pontosJogador;
		this.meeplesJogador = meeplesJogador;
	}

	public Cor getCor() {
		return jogador;
	}
	
	public int getPontos() {
		return pontosJogador;
	}
	
	public int quantidadeMeeples() {
		return meeplesJogador;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return jogador+"("+pontosJogador+","+meeplesJogador+")";
	}
}