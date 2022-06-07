package br.com.mudi.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mudi.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("CADEIRA GAMER PICHAU OMEGA");
		pedido.setUrlImagem("https://media.pichau.com.br/media/catalog/product/cache/ef72d3c27864510e5d4c0ce69bade259/p/g/pg-omg-blu01.jpg");
		pedido.setUrlProduto("https://www.pichau.com.br/cadeira-gamer-pichau-omega-azul-e-dourada-pg-omg-blu01");
		pedido.setDescricao("Cadeira gamer azul e dourada");
		
		List<Pedido> pedidos = Arrays.asList(pedido); 
		model.addAttribute("pedidos",pedidos);
			
	
		return "home";
	}
	
}