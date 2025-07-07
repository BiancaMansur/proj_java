package br.cefet;

import br.cefet.view.ScanAtendente;
import br.cefet.controller.*;
import br.cefet.view.MenuView;

public class MyApp {
    public static void main(String[] args) {
        //Creating AlunoController
        AlunoController alunoController = new AlunoController();

        MenuView menu = new MenuView();
        int opcao;
        do {
            opcao = menu.getMenuOption();
            switch (opcao) {
                case 1:
                    alunoController.iniciar();
                    break;
                case 2:
                    // treinadorController.listarTreinadores(); //criar treinador :
                    break;
                case 0:
                    menu.mostrarMensagem("Saindo...");
                    break;
                default:
                    menu.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }


    
}
