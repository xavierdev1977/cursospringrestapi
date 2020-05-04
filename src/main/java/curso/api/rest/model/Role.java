package curso.api.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "role")
@SequenceGenerator(name = "seq_role", sequenceName = "seq_name", allocationSize = 1, initialValue = 1)
public class Role implements GrantedAuthority {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "seq_role", strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String nomeRole;//Papel ex, ROLE_SECRETARIO, ROLE_GERENTE

	@Override
	public String getAuthority() { //Retorna o nome no papel, acesso ou autorizacao exemplo ROLE_GERENTE
		return this.nomeRole;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeRole() {
		return nomeRole;
	}

	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}		
}
