package com.cursospring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursospring.domain.Cliente;
import com.cursospring.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> find (@PathVariable Integer id) { //@PathVariable traduz o id da requisição para o parametro da função
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
