package br.ufpb.dcx.aps.carcassone.resource;
package com.algaworks.resource;

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

import com.algaworks.model.Jogador;

@RestController
public class JogadorResource {
	
	private Map<Integer, br.ufpb.dcx.aps.carcassone.Jogador> jogador;
	
	public JogadorResource() {
		jogador = new HashMap<Integer, Jogador>();
		
		Jogador j1 = new Jogador(1, "VERMELHO", 0, 7);
		Jogador j2 = new Jogador(2, "AZUL", 0, 7);
		Jogador j3 = new Jogador(3, "AMRELO", 0, 7);
		
		jogador.put(1, j1);
		jogador.put(2, j2);
		jogador.put(3, j3);
	}
	
	@RequestMapping(value = "/jogador", method = RequestMethod.GET)
	public ResponseEntity<List<Jogador>> listar(){
		return new ResponseEntity<List<Curso>>(new ArrayList<Jogador>(jogador.values()), HttpStatus.OK);
	}

}
