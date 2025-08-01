import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

class Usuario {
    String nome;
    String email;
    int cpf;
    String senha;

    HashMap<String, ArrayList<Double>> notasPorMateria = new HashMap<>();

    Usuario(String nome, String email, int cpf, String senha) {
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
        mostrarNotas();
    }

    public void adicionarNota(String materia, double nota) {
        if (!notasPorMateria.containsKey(materia)) {
            notasPorMateria.put(materia, new ArrayList<>());
        }
        notasPorMateria.get(materia).add(nota);
    }

    public void mostrarNotas() {
        System.out.println("Notas por matéria:");
        if (notasPorMateria.isEmpty()) {
            System.out.println("Nenhuma nota registrada.");
        } else {
            for (String materia : notasPorMateria.keySet()) {
                System.out.println("- " + materia + ": " + notasPorMateria.get(materia));
            }
        }
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getCpf() { return cpf; }
    public void setCpf(int cpf) { this.cpf = cpf; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}

public class chatgpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        int resposta = 0;

        while (resposta != 7) {
            System.out.println("\n------------------");
            System.out.println("Bem-vindo ao Sistema da Escola");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Editar Dados de Aluno");
            System.out.println("4 - Cadastrar como Administrador (não implementado)");
            System.out.println("5 - Adicionar Nota");
            System.out.println("6 - Mostrar Notas");
            System.out.println("7 - Sair");
            resposta = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (resposta == 1) {
                System.out.println("Nome completo:");
                String nome = sc.nextLine();

                System.out.println("Email:");
                String email = sc.nextLine();

                System.out.println("CPF:");
                int cpf = sc.nextInt();

                System.out.println("Senha:");
                String senha = sc.next();

                Usuario usuario = new Usuario(nome, email, cpf, senha);
                listaUsuarios.add(usuario);
                usuario.mostrarUsuario();
                resposta = 0;
            }

            else if (resposta == 2) {
                int index = 1;
                for (Usuario usuario : listaUsuarios) {
                    System.out.println("Aluno " + index + ":");
                    usuario.mostrarUsuario();
                    index++;
                }
                resposta = 0;
            }

            else if (resposta == 3) {
                System.out.println("Digite o número do aluno para editar:");
                int id = sc.nextInt();
                sc.nextLine();
                if (id >= 1 && id <= listaUsuarios.size()) {
                    Usuario usuario = listaUsuarios.get(id - 1);
                    System.out.println("1 - Nome\n2 - Email\n3 - CPF\n4 - Senha");
                    int opcaoEditar = sc.nextInt();
                    sc.nextLine();
                    switch (opcaoEditar) {
                        case 1:
                            System.out.println("Novo nome:");
                            usuario.setNome(sc.nextLine());
                            break;
                        case 2:
                            System.out.println("Novo email:");
                            usuario.setEmail(sc.nextLine());
                            break;
                        case 3:
                            System.out.println("Novo CPF:");
                            usuario.setCpf(sc.nextInt());
                            break;
                        case 4:
                            System.out.println("Nova senha:");
                            usuario.setSenha(sc.next());
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                } else {
                    System.out.println("ID inválido.");
                }
                resposta = 0;
            }

            else if (resposta == 5) {
                System.out.println("Digite o número do aluno:");
                int id = sc.nextInt();
                sc.nextLine();

                if (id >= 1 && id <= listaUsuarios.size()) {
                    Usuario usuario = listaUsuarios.get(id - 1);
                    System.out.println("Nome da matéria:");
                    String materia = sc.nextLine();

                    System.out.println("Nota:");
                    double nota = sc.nextDouble();

                    usuario.adicionarNota(materia, nota);
                    System.out.println("Nota adicionada com sucesso!");
                } else {
                    System.out.println("ID inválido.");
                }
                resposta = 0;
            }

            else if (resposta == 6) {
                System.out.println("Digite o número do aluno:");
                int id = sc.nextInt();
                sc.nextLine();

                if (id >= 1 && id <= listaUsuarios.size()) {
                    Usuario usuario = listaUsuarios.get(id - 1);
                    usuario.mostrarNotas();
                } else {
                    System.out.println("ID inválido.");
                }
                resposta = 0;
            }

            else if (resposta == 7) {
                System.out.println("Encerrando o sistema...");
            }

            else {
                System.out.println("Opção inválida!");
                resposta = 0;
            }
        }

        sc.close();
    }
}
