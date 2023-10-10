package br.com.Dizimo.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Dizimo.model.entities.ContaMembro;

public interface ContaMembroRepository extends JpaRepository<ContaMembro, Long> {
    Optional<ContaMembro> findByNumeroDaContaAndSenhaAndAtivoIsTrue(Integer numDaConta,Integer senha);
}
