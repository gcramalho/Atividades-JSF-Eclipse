package br.com.contatoUser;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped

public class ContatoBean {
	
	private String nome;
	private String sobrenome; 
	private String telefone;
	private String email;
	
	// getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getTelefone() { 
		return telefone; 
	}
	
    public void setTelefone(String telefone) { 
    	this.telefone = telefone; 
    }
    
    public String getEmail() { 
    	return email; 
    }
    
    public void setEmail(String email) { 
    	this.email = email; 
    }
    
    // Ação 
    public String enviar() {
    	System.out.println("Dados enviados: " + nome + " " + sobrenome);
        return "formulario.xhtml";
    }
}
