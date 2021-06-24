package Entidades;

import java.util.Date;

/**
 *
 * @author arils
 */
public class Cliente {
    
    private String nome;
    private String email;
    private Date nascimento;

    public Cliente() {
    }

    public Cliente(String nome, String email, Date nascimento) {
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
}
