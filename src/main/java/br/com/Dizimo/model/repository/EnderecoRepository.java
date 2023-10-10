package br.com.Dizimo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Dizimo.model.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
