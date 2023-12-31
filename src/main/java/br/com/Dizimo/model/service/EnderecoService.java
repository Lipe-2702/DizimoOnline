package br.com.Dizimo.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.Dizimo.model.entities.Endereco;
import br.com.Dizimo.model.repository.EnderecoRepository;
import jakarta.transaction.Transactional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    @Transactional
    public Endereco salvarEndereco(Endereco endereco) {
        return repository.save(endereco);
    }

    public Optional<Endereco> listarEnderecoPorID(Long id) {
        try {
            return Optional.ofNullable(repository.findById(id).orElseThrow(() -> new Exception("Endereço não encontrado")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Transactional
    public Endereco alterarEndereco(Endereco atualizarEndereco) {
        Endereco endereco = new Endereco();

        if (atualizarEndereco.getRua() != null) {
            endereco.setRua(atualizarEndereco.getRua());
        }

        if (atualizarEndereco.getNumero() != null) {
            endereco.setNumero(atualizarEndereco.getNumero());
        }

        if(atualizarEndereco.getBairro() != null) {
            endereco.setBairro(atualizarEndereco.getBairro());
        }

        if (atualizarEndereco.getCidade() != null) {
            endereco.setCidade(atualizarEndereco.getCidade());
        }

        if (atualizarEndereco.getEstado() != null) {
            endereco.setEstado(atualizarEndereco.getEstado());
        }

        return endereco;
    }
}
