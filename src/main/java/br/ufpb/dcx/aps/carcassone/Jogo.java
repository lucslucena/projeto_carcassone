package br.ufpb.dcx.aps.carcassone;

import java.util.ArrayList;
import br.ufpb.dcx.aps.carcassone.tabuleiro.Tile;
/*
public class Jogo {

	private Tile proximoTile;
    private String status = "Início";
    private Cor[] pecaDoJogador;
    private Cor proximaPecaDoJogador;
    private int quantPecas;
    static int indiceDePecas = 0;
    ArrayList<Tile> tilesUsar = new ArrayList<Tile>();
    


    public Partida criarPartida(BolsaDeTiles tiles, Cor... sequencia) {
    	

        if (tiles == null) {
            throw new ExcecaoJogo("A bolsa de tiles deve ser fornecida na criação de uma partida");        	
        }
        if (sequencia.length < 2) {
            throw new ExcecaoJogo("Cada partida deve ter uma sequência de pelo menos dois jogadores");
        }
        for (int k = 0; k < sequencia.length; k++) {
            for (int i = 0; i < sequencia.length; i++) {
                if (k != i && sequencia[i] == sequencia[k]) {
                    throw new ExcecaoJogo("Não pode haver repetição de cores na sequência de jogadores");
                }
            }
        }
      

        pecaDoJogador = sequencia;
        status = "Em_Andamento";
        indiceDePecas = 0;
        proximaPecaDoJogador = pecaDoJogador[indiceDePecas % pecaDoJogador.length];
        proximoTile = tilesUsar.get(tilesUsar.size()-1);
        return new Partida(tiles,sequencia);

    }
    
    public String relatorioNoInicioDaPartida() {    
        
        String sequencia = "VERMELHO(0,7); VERDE(0,7)";
        for(int k = 0; k <pecaDoJogador.length; k++) {
            sequencia += pecaDoJogador[k].toString();
        }               
        String relatorio = "Status: " + status + "\nJogadores: " + sequencia;
        return relatorio;
        //return "Status: " + status + "\nJogadores: " + sequencia;
    }
    
    
    public String PartidaTile() {
        
        
        status = "Partida_Finalizada";
        String sequencia = "AZUL(0,7); VERDE(0,7)";
        String relatorio = "Status: " + status + "\nJogadores: " + sequencia;
        return relatorio;
        
    }
	public Jogo girarTile() {	
		if(proximoTile != null);
			proximoTile.girar();
		return this;
	}
    
}*/

public class Jogo {

	private boolean jogoIniciado = false;
	
	public Partida criarPartida(BolsaDeTiles tiles, Cor... sequencia) {
		
		if(tiles == null){
			throw new ExcecaoJogo("A bolsa de tiles deve ser fornecida na criação de uma partida"); 			
		}
		
		if (sequencia.length < 2) {
			throw new ExcecaoJogo("Cada partida deve ter uma sequência de pelo menos dois jogadores");
		}

		for (int i = 0; i < sequencia.length - 1; ++i) {
			for (int j = i + 1; j < sequencia.length; ++j) {
				if (sequencia[i] == sequencia[j]) {
					throw new ExcecaoJogo("Não pode haver repetição de cores na sequência de jogadores");
				}
			}
		}
		
		return new Partida(tiles,sequencia);
	}
	
	

}




