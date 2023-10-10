package br.com.Dizimo.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Dizimo.model.entities.ContaIgreja;

public interface ContaIgrejaRepository extends JpaRepository<ContaIgreja, Long> {

    Optional<ContaIgreja> findByNumeroDaContaAndSenhaAndAtivoIsTrue(Integer numDaConta,Integer senha);
}
