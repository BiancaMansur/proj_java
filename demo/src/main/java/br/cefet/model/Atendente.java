package br.cefet.model;

public class Atendente extends Funcionario {
    private TipoTurno turno;
    
    public Atendente(TipoTurno turno, int matricula, String genero, float salario, String nome, String setor, String dataNascimento, TipoContrato tipoContrato, String status, String dataAdmissao, String ctps, int id){
        super(matricula, genero, salario, nome, setor, dataNascimento, tipoContrato, status, dataAdmissao, ctps, id);
        setTurno(turno);
    }

    public TipoTurno getTurno() {
        return turno;
    }

    public void setTurno(TipoTurno turno) {
        this.turno = turno;
    }

}
