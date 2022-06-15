package br.com.mudi.mudi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/oferta")
public class OfertaController {
	
	@GetMapping
	public String getFormularioParaOfertas() {
		return "oferta/home";
		
	}

}
