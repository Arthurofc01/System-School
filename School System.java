import java.util.Scanner;


// Classe Usuario

public class Registo {
    String nometd;
    String cpf;
    String contatodoresponsavel;
    String idade;

    Registo(String nometd, String cpf, String contatodoresponsavel, String idade){
        this.nometd = nometd;
        this.cpf = cpf;
        this.contatodoresponsavel = contatodoresponsavel;
        this.idade = idade;
}

void mostrarUsuario() {
        System.out.println("--------------------------------------------");
        System.out.println("--------- Registro feito com exito ---------");
        System.out.println("--------------------------------------------");
        System.out.println("noome: " + this.nometd);
        System.out.println("idade: " + this.idade);
        System.out.println("noome: " + this.contatodoresponsavel);
        System.out.println("idade: " + this.cpf);
    }

class Usuario {
    String user;
    String senha;

    // Construtor
    Usuario(String user, String senha) {
        this.user = user;
        this.senha = senha;
    }

    

    // Mostrar informações do usuário
    void mostrarUsuario() {
        System.out.println("--------------------------------------------");
        System.out.println("------ Cadastro realizado com sucesso ------");
        System.out.println("--------------------------------------------");
        System.out.println("Usuário: " + this.user);
        System.out.println("Senha: " + this.senha);
    }

    // Validar login
    boolean validarLogin(String userLogin, String senhaLogin) {
        return (this.user.equals(userLogin) && this.senha.equals(senhaLogin));
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
}

// Classe principal
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

         System.out.print("Tem Login?: ");

        System.out.print("Digite o nome de usuário: ");
        String nome = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        Usuario novoUsuario = new Usuario(nome, senha);
        novoUsuario.mostrarUsuario();

        System.out.print("\n\n=== Login ===\n");
        System.out.print("Usuário: ");
        String login = sc.nextLine();

        System.out.print("Senha: ");
        String loginSenha = sc.nextLine();

        if (novoUsuario.validarLogin(login, loginSenha)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }

        sc.close();
    }
}

}