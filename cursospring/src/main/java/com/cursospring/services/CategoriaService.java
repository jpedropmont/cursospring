package com.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursospring.domain.CategoriaDomain;
import com.cursospring.repositories.CategoriaRepository;
import com.cursospring.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public CategoriaDomain buscar(Integer id) {
		Optional<CategoriaDomain> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + CategoriaDomain.class.getName()));
	}
	
}
