package br.com.Dizimo.model.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.Dizimo.model.enums.Genero;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_membros")
@Getter
@Setter
@NoArgsConstructor
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "cpf", unique = true, nullable = false, length = 14)
    private String cpf;
    private String nome;
    private Integer idade;
    private LocalDate dataDeNascimento;
    private Genero sexo;
    private String email;
    private Integer senha;
    private Boolean ativo;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Endereco endereco;
    @OneToOne(fetch = FetchType.LAZY,mappedBy = "membro")
    private ContaMembro contaMembro;


    public Membro(String nome, String cpf, LocalDate dataDeNascimento, Genero sexo, Integer senha, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.senha = senha;
        this.email = email;
        this.ativo = true;
    }

    public Membro(String nome, String email, Integer senha, Endereco enderecoAtualizado) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = enderecoAtualizado;
    }
    
    

   
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Genero getSexo() {
		return sexo;
	}

	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ContaMembro getContaMembro() {
		return contaMembro;
	}

	public void setContaMembro(ContaMembro contaMembro) {
		this.contaMembro = contaMembro;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Membro {\n");
        sb.append("  ID: ").append(id).append("\n");
        sb.append("  CPF: ").append(cpf).append("'\n");
        sb.append("  nome: ").append(nome).append("'\n");
        sb.append("  Idade: ").append(idade).append("\n");
        sb.append("  data de nascimento: ").append(dataDeNascimento).append("\n");
        sb.append("  Sexo: ").append(sexo.getDescricao()).append("\n");
        sb.append("  email: ").append(email).append("'\n");
        sb.append("  Senha: ").append(senha).append("\n");
        sb.append("  Endereço: ").append(endereco.toString()).append("\n");
        sb.append("}");
        return sb.toString();
    }

}
