import java.util.Scanner;
import java.util.ArrayList;

class Usuario {
    String nome;
    String senha;
    String email;
    int cpf;

    Usuario(int cpf, String nome, String senha, String email){
        this.cpf = cpf;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
    }

    void mostrarUsuario() {
        System.out.println("--------------------------------------------");
        System.out.println("------ Cadastro realizado com sucesso ------");
        System.out.println("--------------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Senha: " + this.senha);
        System.out.println("Email: " + this.email);
        System.out.println("Cpf: " + this.cpf);

    }
}


public class teste {
    public static void main(String[] args) throws Exception  {
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        System.out.println("Bem vindo ao Sistema da escola");
        System.out.println("");
        System.out.println("Escreva seu nome completo");
        String nome = sc.next();
        System.out.println("Nome registrado!");
        System.out.println("Escreva seu Email");
        String email = sc.next();
        System.out.println("Email registrado");
        System.out.println("Seu cpf");
        int cpf = sc.nextInt();
        System.out.println("Cpf registrado");
        System.out.println("Registre sua nova senha");
        String senha = sc.next();
        System.out.println("Senha registrada");
        
        Usuario usuario = new Usuario (nome , cpf , email , senha);
        listaUsuarios.add(usuario);

        System.out.println("mostrar lista de usuarios");
        for (Usuario usuario : listaUsuarios) {
            usuario.mostrarUsuario();
        }

    }
}
