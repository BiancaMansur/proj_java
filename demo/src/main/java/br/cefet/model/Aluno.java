package br.cefet.model;

import java.util.List;
import java.util.ArrayList;

/**
 * Represents a student with a subscription and evaluations.
 * Inherits basic personal information from the Pessoa class.
 * @author Your Name
 */
public class Aluno extends Pessoa{
    private Assinatura assinatura;
    private List<Avaliacao> avaliacoes;  

    /**
     * Constructs a new Aluno (Student) with basic personal information.
     * Initializes an empty list of evaluations.
     * 
     * @param nome The student's name
     * @param matricula The student's registration number
     * @param dataNascimento The student's birth date (format DD/MM/YYYY)
     * @param genero The student's gender
     */
    //BIA: INT ID
    public Aluno(String nome, int matricula, String dataNascimento, String genero, int id){
        super(nome, matricula, dataNascimento, genero, id);
        avaliacoes = new ArrayList<>();
    }

    /**
     * Gets the student's subscription information
     * @return The Assinatura object associated with this student
     */
    public Assinatura getAssinatura(){
        return assinatura;
    }
    
    /**
     * Sets/Updates the student's subscription information
     * @param assinatura The Assinatura object to associate with this student
     */
    public void setAssinatura(Assinatura assinatura){
        this.assinatura = assinatura;        
    }

    /**
     * Adds a new evaluation to the student's evaluation list
     * @param avaliacao The Avaliacao object to add to the student's evaluations
     */
    public void addAvaliacao(Avaliacao avaliacao){
        this.avaliacoes.add(avaliacao);
    } 

    public static Aluno fromCSV (String linhaCSV) {
        String[] dados = linhaCSV.split(";");
        int id = Integer.parseInt(dados[0]);
        String nome = dados[1];
        int matricula = Integer.parseInt(dados[2]);
        String dataNascimento = dados[3];
        String genero = dados[4];
        Aluno aluno = new Aluno(nome, matricula, dataNascimento, genero, id);
        return aluno;
    }
    
    public String toCSV (){
        return getId() + ";" + getNome() + ";" + getMatricula() + ";" + getDataNascimento() + ";" + getGenero();
    }
}