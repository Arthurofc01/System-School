import java.util.Scanner;
import java.security.PublicKey;
import java.util.ArrayList;

class Usuario {
    String nome;
    String email;
    int cpf;
    String senha;


    Usuario(String nome,String email, int cpf, String senha){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;

    }

    void mostrarUsuario() {
        System.out.println("--------------------------------------------");
        System.out.println("------ Cadastro realizado com sucesso ------");
        System.out.println("--------------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Senha: " + this.senha);

    }

    void adicionarNota(alunosNotas nota) {
    notas.add(nota);
}

void mostrarNotas() {
    if (notas.isEmpty()) {
        System.out.println("Nenhuma nota registrada.");
    } else {
        System.out.println("Notas:");
        for (alunosNotas nota : notas) {
            System.out.println(nota);
        }
    }
}


    public String getNome() {
        return nome;
    }

    public void setNome( String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email){
        this.email = email; 
    }

    public int getCpf() {
        return cpf;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

      public String getSenha() {
        return senha;
    }

    public void setSenha( String senha) {
         this.senha = senha;
    }

} 


public class SchoolSystem {
    public static void main(String[] args) throws Exception  {
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<alunosNotas> notas = new ArrayList<>();

        

        System.out.println("------------------");
        System.out.println("Bem vindo ao Sistema da escola");
        System.out.println("------------------");
        
        int resposta = 0;

        while ( resposta != 7 ) { 

            System.out.println("Digite o que deseja de 1 a 4");
            System.out.println("1 cadastrar como aluno\n 2 Listar alunos\n 3 editar dados dos alunos \n 4 cadastrar como Administrador\n 5 Adicionar Nota \n 6 mostrar notas \n 7 Exit");
             resposta = sc.nextInt();

             if (resposta == 1) {
                    System.out.println("Escreva seu nome completo");
                    String nome = sc.next();
                    System.out.println("------------------");
                    System.out.println("Nome registrado!");
                    System.out.println("------------------");
                    System.out.println("Escreva seu Email");
                    String email = sc.next();
                    System.out.println("------------------");
                    System.out.println("Email registrado");
                    System.out.println("------------------");
                    System.out.println("Seu cpf");
                    int cpf = sc.nextInt();
                    System.out.println("------------------");
                    System.out.println("Cpf registrado!");
                    System.out.println("------------------");
                    System.out.println("Registre sua nova senha");
                    String senha = sc.next();
                    System.out.println("Senha registrada");


                    
                    Usuario usuario = new Usuario ( nome , email , cpf, senha);
                    listaUsuarios.add(usuario);
                
                    usuario.mostrarUsuario();

                    resposta = 0;
            } 
            
                else if( resposta == 2 ) { 
            
                for (Usuario usuario: listaUsuarios){

                    usuario.mostrarUsuario();                    

            } 
        }
                if ( resposta == 3 ) { 

                    int indice = 1;
                    System.out.println("----------------------------------------------");
                    for (Usuario usuario: listaUsuarios) {
                    System.out.println("Usuarios" + indice + ": ");
                    usuario.mostrarUsuario();
                    indice  += 1; 
                    System.out.println("----------------------------------------------");

                    resposta = 0;

            }

            System.out.println("digite o id que voce quer editar");
            indice = 1;
            int idAluno = sc.nextInt();
            for ( Usuario usuario: listaUsuarios ) {

                if (indice == idAluno ) {
  
                    System.out.println("digite o que deseja mudar de 1 a 4");
                    System.out.println("1 nome \n 2 email \n 3 cpf \n 4 senha ");
                    resposta = sc.nextInt();

                    if (resposta == 1) {

                        System.out.println("digite um novo nome");
                        String novoNome = sc.next();
                        usuario.setNome(novoNome);
                        System.out.println("Novo nome registrado");

                    }

                    if (resposta == 2) {

                        System.out.println("digite um novo email");
                        String novaSenha = sc.next();
                        usuario.setNome(novaSenha); 
                        System.out.println("Novo Cpf registrado");

                    }

                    if (resposta == 3) {

                        System.out.println("digite um novo Cpf");
                        String novaSenha = sc.next();
                        usuario.setNome(novaSenha); 
                        System.out.println("Novo Cpf registrado");

                    }

                    if (resposta == 4) {

                        System.out.println("digite uma nova senha");
                        String novaSenha = sc.next();
                        usuario.setNome(novaSenha); 
                        System.out.println("Nova senha registrada");

                    } 

                }

                indice += 1;
                resposta = 0;

            }


                }

            if ( resposta == 5 ) {
                System.out.println("Digite o número do aluno:");
                int idAluno = sc.nextInt();

                if ( idAluno >= 1 && idAluno <= listaUsuarios.size()); {

                     Usuario aluno = listaUsuarios.get(idAluno - 1);

                     System.out.println("Digite a nota:");
                     alunosNotas nota = sc.nextDouble();

                     aluno.adicionarNota(nota);
                     System.out.println("Nota adicionada com sucesso!");

                     } 
                                    [[]]
                else {

                     System.out.println("ID inválido.");

    }

    resposta = 0;
}


if (resposta == 6) {
    System.out.println("Digite o número do aluno para ver as notas:");
    int idAluno = sc.nextInt();

    if (idAluno >= 1 && idAluno <= listaUsuarios.size()) {
        Usuario aluno = listaUsuarios.get(idAluno - 1);

        System.out.println("Notas do aluno " + aluno.getNome() + ":");
        aluno.mostrarNotas();
    } else {
        System.out.println("ID inválido.");
    }

    resposta = 0;
}

                } 


            }

            
        }

    


