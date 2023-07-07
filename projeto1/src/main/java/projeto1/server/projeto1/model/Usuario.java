package projeto1.server.projeto1.model;

import jakarta.persistence.*;

//CRUD - CREATE, READ, UPDATE, DELETE

@Entity
@Table(name = "tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nome;
    private int idade;
    private String email;
    private String senha;

    // Id

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Nome

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Idade

    public int getIdade() {
        return this.idade;
    }

    public void setNome(int idade) {
        this.idade = idade;
    }

    // email

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Senha

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
