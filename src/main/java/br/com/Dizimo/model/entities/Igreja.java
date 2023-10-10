package br.com.Dizimo.model.entities;

import java.time.LocalDate;

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
@Table(name = "tb_igrejas")
@Getter
@Setter
@NoArgsConstructor
public class Igreja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDaIgreja;
    @Column(name = "cnpj", unique = true, nullable = false)
    private String cnpj;
    private String email;
    private Integer senha;
    private LocalDate dataDeFundacao;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Endereco endereco;
    private Boolean ativo;
    @OneToOne(fetch = FetchType.LAZY,mappedBy = "igreja")
    private ContaIgreja contaIgreja;

    public Igreja(String nomeDaIgreja, String cnpj, Integer senha, LocalDate dateOfBirth, String email) {
        this.nomeDaIgreja = nomeDaIgreja;
        this.cnpj = cnpj;
        this.email = email;
        this.senha = senha;
        this.dataDeFundacao = dateOfBirth;
        this.ativo = true;
    }
    
    

    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNomeDaIgreja() {
		return nomeDaIgreja;
	}



	public void setNomeDaIgreja(String nomeDaIgreja) {
		this.nomeDaIgreja = nomeDaIgreja;
	}



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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



	public LocalDate getDataDeFundacao() {
		return dataDeFundacao;
	}



	public void setDataDeFundacao(LocalDate dataDeFundacao) {
		this.dataDeFundacao = dataDeFundacao;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	public Boolean getAtivo() {
		return ativo;
	}



	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}



	public ContaIgreja getContaIgreja() {
		return contaIgreja;
	}



	public void setContaIgreja(ContaIgreja contaIgreja) {
		this.contaIgreja = contaIgreja;
	}



	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Igreja {\n");
        sb.append("  ID: ").append(id).append("\n");
        sb.append("  Nome da igreja: '").append(nomeDaIgreja).append("'\n");
        sb.append("  CNPJ: '").append(cnpj).append("'\n");
        sb.append("  email: '").append(email).append("'\n");
        sb.append("  Senha: ").append(senha).append("\n");
        sb.append("  Data de fundação: ").append(dataDeFundacao).append("\n");
        sb.append("  Endereço: ").append(endereco).append("\n");
        sb.append("}");
        return sb.toString();
    }

}
