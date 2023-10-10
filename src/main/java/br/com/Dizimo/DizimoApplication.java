package br.com.Dizimo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.Dizimo.model.entities.Endereco;
import br.com.Dizimo.model.entities.Membro;
import br.com.Dizimo.model.enums.Estado;
import br.com.Dizimo.model.service.MembroService;
import br.com.Dizimo.view.MembroView;

@SpringBootApplication
public class DizimoApplication implements CommandLineRunner {
    @Autowired
    private MembroView membroView;
    @Autowired
    private MembroService membroService;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SpringApplication.run(DizimoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite a senha do membro: ");
        Integer senhaAtual = scanner.nextInt();

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o email do membro: ");
        String email = scanner.nextLine();

        System.out.print("Digite a senha do membro: ");
        Integer novaSenha = scanner.nextInt();

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

        Endereco enderecoAtualizado = new Endereco(rua,numero,bairro,cidade,estado1);

        Membro membroAtualizado = new Membro(nome,email,novaSenha,enderecoAtualizado);

        membroService.alterarMembro(cpf,senhaAtual,membroAtualizado);
    }
}
