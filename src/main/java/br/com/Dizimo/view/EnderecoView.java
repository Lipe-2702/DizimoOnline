package br.com.Dizimo.view;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.Dizimo.model.entities.Endereco;
import br.com.Dizimo.model.enums.Estado;
import br.com.Dizimo.model.service.EnderecoService;

@Component
public class EnderecoView {
    private static Scanner scanner = new Scanner(System.in);
    @Autowired
    private EnderecoService enderecoService;

    public Endereco cadastrarEndereco() {
        System.out.println("Digite o nome da rua: ");
        String rua = scanner.nextLine();

        System.out.println("Digite o numero da sua residencia: ");
        Integer numero = scanner.nextInt();

        System.out.println("Digite o nome do seu bairro: ");
        String bairro = scanner.nextLine();
        bairro = scanner.nextLine();

        System.out.println("Digite o nome da sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("Digite a sigla do seu estado (ex: SP): ");
        String estado = scanner.nextLine();
        Estado estado1 = Estado.acronym(estado);

        var endereco = new Endereco(rua,numero,bairro,cidade,estado1);

        Endereco enderecoCadastrado = enderecoService.salvarEndereco(endereco);

        return enderecoCadastrado;
    }
}
