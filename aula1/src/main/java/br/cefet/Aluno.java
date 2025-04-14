package br.cefet;

public class Aluno {
    private int matriculaAluno;
    private String nome, cpf, logradouro, numeroCasa, bairro, estado, cep, telefone, email, dataNascimento, dataMatricula;
    private String planoPagamento;
    private float altura, peso, imc, pagamentoAluno;   
    private Plano plano;

//visibilidade
    public Plano getPlano (){
        return plano;
    }

    public Aluno(String nome, int matricula, String dataNascimento, String cpf){
        this.nome = nome;
        this.matriculaAluno = matricula;
        this.setDataNascimento(dataNascimento);
        this.cpf =  cpf;
    }

    public int getMatriculaAluno(){
        return matriculaAluno;
    }
    public String getDataMatricula() {
        return dataMatricula;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getNumeroCasa() {
        return numeroCasa;
    }
    public String getBairro() {
        return bairro;
    }
    public String getEstado() {
        return estado;
    }public String getCep() {
        return cep;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public float getPagamentoAluno() {
        return pagamentoAluno;
    }
    public String getPlanoPagamento() {
        return planoPagamento;
    }
    public float getAltura() {
        return altura;
    }
    public float getPeso() {
        return peso;
    }
    public float getImc() {
        return imc;
    }




    

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setImc(float imc) {
        this.imc = imc;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    public void setPagamentoAluno(float pagamentoAluno) {
        this.pagamentoAluno = pagamentoAluno;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setPlanoPagamento(String planoPagamento) {
        this.planoPagamento = planoPagamento;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}