package Model.Vistante;

import Model.Museu;
import Model.Tema.Tema;

import java.util.ArrayList;
import java.util.Date;

public class Visitante {
    private String nome;
    private String cpf;
    private Date data_nascimento;
    private int codTema;

    public Visitante(String nome, String cpf, int ano, int mes, int dia, int codTema) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = new Date(ano, mes, dia);
        this.codTema = codTema;
    }

    public void retornaTema(Museu museu) {
        ArrayList<Tema> temas = museu.getTemas();
        for (int i = 0; i < Tema.codigo; i++) {
            if (i+1 == this.codTema){
                System.out.println(this.nome + " ira vitar a exposição "+ temas.get(i).getNome());
            }
        }
    }

    public void retornaItens(Museu museu) {
        ArrayList<Tema> temas = museu.getTemas();
        for (int i = 0; i < Tema.codigo; i++) {
            if (i+1 == this.codTema){
                System.out.println(this.nome + " contou "+ temas.get(i).getItens_expostos());
            }
        }
    }
}