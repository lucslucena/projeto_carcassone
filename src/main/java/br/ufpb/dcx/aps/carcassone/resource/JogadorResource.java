package br.ufpb.dcx.aps.carcassone.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ufpb.dcx.aps.carcassone.Cor;
import br.ufpb.dcx.aps.carcassone.Jogador;

@RestController
public class JogadorResource {
	
	private Map<Integer, br.ufpb.dcx.aps.carcassone.Jogador> jogador;
	
	public JogadorResource() {
		jogador = new HashMap<Integer, Jogador>();
		
		Jogador j1 = new Jogador(1, Cor.VERMELHO, 0, 7);
		Jogador j2 = new Jogador(2, Cor.AZUL, 0, 7);
		Jogador j3 = new Jogador(3, Cor.AMARELO, 0, 7);
		
		jogador.put(1, j1);
		jogador.put(2, j2);
		jogador.put(3, j3);
	}
	
	@RequestMapping(value = "/jogador/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<Jogador>> listar(){
		return new ResponseEntity<List<Jogador>>(new ArrayList<Jogador>(jogador.values()), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/jogador/{id}", method = RequestMethod.GET)
	public ResponseEntity<Jogador> buscar(@PathVariable("id")Integer id){
		Jogador j1 = jogador.get(id);
		if(jogador == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
