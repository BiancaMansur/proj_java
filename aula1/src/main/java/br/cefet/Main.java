package br.cefet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno n1 = new Aluno("Bianca", 0, null, null);
            n1.setNome("Bruno");
            n1.setBairro("Penha");
            n1.setCep("21020410");
            n1.setCpf("12324858707");
            n1.setDataMatricula("11/03/2025");
            n1.setAltura(1.73f);
            n1.setPeso(85.3f);

        Aluno n2 = new Aluno();
            n2.setNome("João");
            n2.setBairro("Penha");
            n2.setCep("21020412");
            n2.setCpf("32124858722");
            n2.setDataMatricula("23/03/2025");
            n2.setAltura(1.71f);
            n2.setPeso(79.3f);

        Aluno n3 = new Aluno();
            n3.setNome("Felipe");
            n3.setBairro("Penha");
            n3.setCep("21020413");
            n3.setCpf("0592567989");
            n3.setDataMatricula("03/04/2025");
            n3.setAltura(1.70f);
            n3.setPeso(77.3f);

        Plano p1 = new Plano();
        Plano p2 = new Plano();
        Plano p3 = new Plano();
            p1.setPlano("Trimestral");
            p2.setPlano("Semestral");
            p3.setPlano("Anual");

        n1.setPlano(p3);
        n2.setPlano(p1);
        n3.setPlano(p2);

        ArrayList <Plano> name = new ArrayList<Plano> ();
     
        System.out.println(n1.getPlano().getPlano());
        System.out.println(n2.getPlano().getPlano());
        System.out.println(n3.getPlano().getPlano());
        
    }   

}


 