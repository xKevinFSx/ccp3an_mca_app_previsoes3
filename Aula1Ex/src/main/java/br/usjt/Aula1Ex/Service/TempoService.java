package br.usjt.Aula1Ex.Service;

import java.util.List;

import br.usjt.Aula1Ex.model.Tempo;
import br.usjt.Aula1Ex.repository.TempoRepository;

public class TempoService {

	private TempoRepository tempoResp;
	
	public void salvar (Tempo tempo) {
		tempoResp.save(tempo);
	}
	public List <Tempo> listarTodos (){
		return tempoResp.findAll();
	}
	
}
