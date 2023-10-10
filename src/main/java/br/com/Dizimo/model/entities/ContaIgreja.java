package br.com.Dizimo.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ContaIgreja extends Conta {

    @OneToOne
    private Igreja igreja;

    public ContaIgreja(Integer numeroDaConta, Integer senha, Igreja igreja) {
        super(numeroDaConta, senha);
        this.igreja = igreja;
    }

    public ContaIgreja(Integer numeroDaConta, Integer senha){
        super(numeroDaConta,senha);
    }
    
    
    public Igreja getIgreja() {
		return igreja;
	}

	public void setIgreja(Igreja igreja) {
		this.igreja = igreja;
	}

	@Override
    public String toString() {
    	return null;
       // return "\nTitular: " + this.getIgreja().getNomeDaIgreja() + super.toString();
    }

}
