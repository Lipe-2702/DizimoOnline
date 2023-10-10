package br.com.Dizimo.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Dizimo.model.entities.Membro;

public interface MembroRepository extends JpaRepository<Membro, Long> {
    Optional<Membro> findByCpfAndSenhaAndAtivoIsTrue(String cpf,Integer senha);
    Membro getReferenceByCpfAndSenhaAndAtivoIsTrue(String cpf, Integer senha);
}
