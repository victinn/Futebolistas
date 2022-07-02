package Futebolistas.Enteties;

public class Usuario {
    String nome, email, senha;
    Boolean isAdministrador;
    int id;

    public int getId() {
        return id;
    }

    public Usuario(int id, String nome, String email, Boolean isAdministrador) {
        this.nome = nome;
        this.email = email;
        this.isAdministrador = isAdministrador;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getIsAdministrador() {
        return isAdministrador;
    }

    public void setIsAdministrador(Boolean isAdministrador) {
        this.isAdministrador = isAdministrador;
    }
}
