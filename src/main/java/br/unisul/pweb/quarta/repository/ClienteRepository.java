package br.unisul.pweb.quarta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unisul.pweb.quarta.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}