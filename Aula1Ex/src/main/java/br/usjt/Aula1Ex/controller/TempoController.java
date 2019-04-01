package br.usjt.Aula1Ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.Aula1Ex.Service.TempoService;
import br.usjt.Aula1Ex.model.Tempo;

@Controller
public class TempoController {
	
	//@Autowired
	//private TempoRepository tempoResp;
	
	@Autowired
	private TempoService tempoService;
	
	//@Autowired
	//public TempoController(TempoRepository tempoResp) {
	//	this.tempoResp = tempoResp;
	//}
	
	//@Autowired
	//public void setTempoResp(TempoRepository tempoResp) {
	//	this.tempoResp = tempoResp;
	//}
	
	@GetMapping ("/tempo")
	public ModelAndView listarTempo() {
		
		//passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView ("lista_tempo");
		
		// para modelar o formulário
		mv.addObject(new Tempo());
		
		//Busque a coleção com o repositório
		List <Tempo> tempo = tempoService.listarTodos();
		
		//adicione a coleção ao objeto ModelAndView		
		mv.addObject("tempo", tempo);
		
		//devolva o ModelAndView
		return mv;	
	}
	
	@PostMapping
	public String salvar (Tempo tempo) {
		tempoService.salvar(tempo);
		return "redirect:/tempo";
	} 
}
