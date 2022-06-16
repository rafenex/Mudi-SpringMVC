package br.com.mudi.mudi.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mudi.mudi.dto.RequisicaoNovaOferta;
import br.com.mudi.mudi.model.Oferta;
import br.com.mudi.mudi.model.Pedido;
import br.com.mudi.mudi.repository.PedidoRepository;



	@RestController
	@RequestMapping("/api/ofertas")
	public class OfertasRest {
		
		@Autowired
		private PedidoRepository pedidoRepository;
		
		@PostMapping
		public Oferta criaOferta(RequisicaoNovaOferta requisicao) {
			Optional<Pedido> pedidoBuscado = pedidoRepository.findById(requisicao.getPedidoId());
			if(!pedidoBuscado.isPresent()) {
				return null;
			}
			Pedido pedido = pedidoBuscado.get();
			
			Oferta nova = requisicao.toOferta();
			nova.setPedido(pedido);
			pedido.getOfertas().add(nova);
			pedidoRepository.save(pedido);
			
			return nova;
		
			
		}
	
	}
