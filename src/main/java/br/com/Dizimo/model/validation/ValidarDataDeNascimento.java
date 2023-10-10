package br.com.Dizimo.model.validation;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import br.com.Dizimo.model.entities.Membro;

@Component
public class ValidarDataDeNascimento implements IValidar<Membro> {

    @Override
    public void validar(Membro membro) {
        var dataAtual = LocalDate.now();

        if (membro.getDataDeNascimento().isAfter(dataAtual)) {
            throw new IllegalArgumentException("A data de nascimento não pode ser maior que a data atual.");
        }
    }
}
