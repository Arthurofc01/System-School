package App;

public class Usuario {
    // Atributos privados para encapsulamento
    private String user;
    private String senha;
    private String cpf;
    private String responsaveis;

    // Construtor: junta as informações em um objeto
    public Usuario(String user, String senha, String cpf, String responsaveis) {
        this.user = user;
        this.senha = senha;
        this.cpf = cpf;
        this.responsaveis = responsaveis;
    }

    // Método para mostrar informações do usuário
    public void mostrarUsuario() {
        System.out.println("--------------------------------------------");
        System.out.println("------ Cadastro realizado com sucesso ------");
        System.out.println("--------------------------------------------");
        System.out.println("Usuário: " + this.user);
        System.out.println("Senha: " + this.senha);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Responsáveis: " + this.responsaveis);
    }

    // Método para validar login (retorna verdadeiro ou falso)
    public boolean validarLogin(String userLogin, String senhaLogin) {
        return this.user.equals(userLogin) && this.senha.equals(senhaLogin);
    }

    // Getters e Setters
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(String responsaveis) {
        this.responsaveis = responsaveis;
    }
}
