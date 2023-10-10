package br.com.Dizimo.model.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_contas")
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(unique = true)
    private Integer numeroDaConta;
    private Integer senha;
    private BigDecimal saldo;
    private LocalDate dataDeAberturaDaConta;
    private Boolean ativo;

    protected Conta(Integer numeroDaConta, Integer senha) {
        this.numeroDaConta = numeroDaConta;
        this.senha = senha;
        this.saldo = BigDecimal.ZERO;
        this.dataDeAberturaDaConta = LocalDate.now();
        this.ativo = true;
    }
    
    

    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}



	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}



	public Integer getSenha() {
		return senha;
	}



	public void setSenha(Integer senha) {
		this.senha = senha;
	}



	public BigDecimal getSaldo() {
		return saldo;
	}



	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}



	public LocalDate getDataDeAberturaDaConta() {
		return dataDeAberturaDaConta;
	}



	public void setDataDeAberturaDaConta(LocalDate dataDeAberturaDaConta) {
		this.dataDeAberturaDaConta = dataDeAberturaDaConta;
	}



	public Boolean getAtivo() {
		return ativo;
	}



	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}



	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("  ID: ").append(id).append("\n");
        sb.append("  Número da conta: ").append(numeroDaConta).append("\n");
        sb.append("  Senha: ").append(senha).append("\n");
        sb.append("  Saldo: ").append(saldo).append("\n");
        sb.append("  Data de abertura da conta: ").append(dataDeAberturaDaConta).append("\n");
        sb.append("}");
        return sb.toString();
    }

}
