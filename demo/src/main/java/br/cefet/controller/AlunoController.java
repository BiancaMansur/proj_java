package br.cefet.controller;

import br.cefet.dao.AlunoDao;
import br.cefet.model.Aluno;
import br.cefet.view.AlunoView;


public class AlunoController {
    private AlunoDao alunoDao = new AlunoDao();
    private AlunoView alunoView = new AlunoView();

    public void iniciar() {
        int opcao;

        do {
            opcao = alunoView.getMenuOption();
            switch (opcao) {
                case 1:
                   cadastrarAluno();
                    break;
                case 2:
                   listarAlunos();
                    break;
                case 3:
                    deletarAluno();
                    break;
                case 0:
                    alunoView.mostrarMensagem("Saindo do menu de Alunos.");
                    break;
                default:
                    alunoView.mostrarMensagem("Opção inválida! Tente novamente.");  
            }
        } while (opcao != 0);
    }
    public void cadastrarAluno() {
        Aluno aluno = alunoView.obterDados();
        int id = alunoDao.getId();
        aluno.setId(id);
        alunoDao.salvar(aluno);
        alunoView.mostrarMensagem("Aluno cadastrado com sucesso!");
        
    }

    public void listarAlunos() {
        alunoView.listarAlunos(alunoDao.getAlunos());

    }

    public void deletarAluno(){
        int id = alunoView.getIdExcluir();
        boolean excluiu = alunoDao.excluir(id);
        if(excluiu) {
            alunoView.mostrarMensagem("Aluno Excluído");
        } else {
            alunoView.mostrarMensagem("Aluno não localizado");
        }
    }
 
}
    



