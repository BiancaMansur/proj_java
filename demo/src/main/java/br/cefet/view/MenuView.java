package br.cefet.view;

import java.util.Scanner;

public class MenuView {
    private Scanner scanner = new Scanner(System.in);

    public int getMenuOption() {
        System.out.println("=== Menu ===");
        System.out.println("1. Gerenciar Aluno");
        System.out.println("2. Gerenciar Treinador");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }
    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
