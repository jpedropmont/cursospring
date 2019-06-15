package com.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursospring.domain.CategoriaDomain;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaDomain, Integer> {
	
}
