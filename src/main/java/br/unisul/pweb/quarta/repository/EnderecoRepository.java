package br.unisul.pweb.quarta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unisul.pweb.quarta.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}