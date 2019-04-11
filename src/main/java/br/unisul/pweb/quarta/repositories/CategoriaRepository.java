package br.unisul.pweb.quarta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unisul.pweb.quarta.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
