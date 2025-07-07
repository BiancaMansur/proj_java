//Bia: Implementação da classe AlunoView 

package br.cefet.view;

import java.util.List;
import java.util.Scanner;
import br.cefet.model.Aluno;

public class AlunoView {
    private Scanner scanner = new Scanner(System.in);

    public int getMenuOption() {
        System.out.println("=== Menu Aluno ===");
        System.out.println("1. Cadastrar Aluno");
        System.out.println("2. Listar Alunos");
        System.out.println("3. Deletar Aluno");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }
    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public Aluno obterDados(){     
        String nome;
        int matricula;
        String dataNascimento;
        String genero;
        scanner.nextLine();
        System.out.print("Digite o nome do aluno: ");
        nome = scanner.nextLine();
        System.out.println("Digite a matrícula do aluno: ");
        matricula = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a data de nascimento do aluno (DD/MM/YYYY): ");
        dataNascimento = scanner.nextLine();
        //
        System.out.print("Digite o gênero do aluno: ");
        genero = scanner.nextLine();
        return new Aluno(nome, matricula, dataNascimento, genero, 0);
   }

    public void listarAlunos(List<Aluno> alunos) {
        System.out.println("=== Lista de Alunos ===");
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
                System.out.println("Gênero: " + aluno.getGenero());
                System.out.println("-----------------------");
            }
        }
    }

    public int getIdExcluir(){
        scanner.nextLine();
        int id = scanner.nextInt();
        return id;
    }

}
