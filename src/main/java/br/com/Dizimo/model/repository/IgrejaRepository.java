package br.com.Dizimo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Dizimo.model.entities.Igreja;

public interface IgrejaRepository extends JpaRepository<Igreja, Long> {
    Igreja findByCnpjAndSenhaAndAtivoIstrue(String cnpj, Integer senha);

    Igreja getReferenceByCnpjAndSenhaAndAtivoisTrue(String cnpj, Integer senha);
}