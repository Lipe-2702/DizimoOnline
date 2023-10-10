package br.com.Dizimo.model.entities;

import br.com.Dizimo.model.enums.Estado;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_enderecos")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rua;
    private Integer numero;
    private String bairro;
    private String cidade;
    private Estado estado;

    public Endereco(String rua, Integer numero, String bairro, String cidade, Estado estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public Endereco() {}
    
    

    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}



	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public Estado getEstado() {
		return estado;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}



	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Endereço {\n");
        sb.append("  ID: ").append(id).append("\n");
        sb.append("  Rua: ").append(rua).append("'\n");
        sb.append("  Numero: ").append(numero).append("\n");
        sb.append("  Bairro: ").append(bairro).append("'\n");
        sb.append("  Cidade: ").append(cidade).append("'\n");
        sb.append("  Estado: ").append(estado.getFullName()).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
