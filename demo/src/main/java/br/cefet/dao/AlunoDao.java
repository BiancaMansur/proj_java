package br.cefet.dao;

import br.cefet.model.Aluno; 
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.nio.file.*;

public class AlunoDao {
    private List<Aluno> alunos = new ArrayList<>();
    private int idCounter;

    Path caminhoPasta = Paths.get("demo", "data","alunos.csv");   //checar caminho Felipe!!!
    File arquivo = caminhoPasta.toFile();

    public AlunoDao() {
        if (!arquivo.exists()){
            try{
                Files.createDirectories(arquivo.getParentFile().toPath());
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            carregarArquivo();
        }
        
        idCounter = 1; // Start IDs from 1
    }

    public void carregarArquivo(){
       try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))){
            String linha;
            boolean primeiraLinha = true;

            while ((linha = reader.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }
                Aluno a = Aluno.fromCSV(linha);
                alunos.add(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void salvar(Aluno aluno) {
        alunos.add(aluno);
        boolean arquivoVazio = arquivo.length() == 0;

       try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))){
            if(arquivoVazio) {
                writer.write("id;nome;matricula;dataNascimento;genero");
                writer.newLine();
            }
            writer.write(aluno.toCSV());
            writer.newLine();
       } catch (IOException e){
         e.printStackTrace();
       }
    }

    public boolean excluir (int id){
        for(Aluno aluno : alunos){
            if (aluno.getId() == id){
                alunos.remove(aluno);
                atualizarLista();
                return true;
            }
        }
        return false;
    }

     public void atualizarLista() {
       

       try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))){
            
            writer.write("id;nome;matricula;dataNascimento;genero");
            writer.newLine();
            for(Aluno aluno : alunos){
                writer.write(aluno.toCSV());
                writer.newLine();
            }
       } catch (IOException e){
         e.printStackTrace();
       }
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }


    public int getId() {
        return idCounter++;
    }
}
