package Model.Vistante;

import Model.Museu;
import Model.Tema.Tema;

public class VisitantePremium extends Visitante {
    double ticket = 100;

    public VisitantePremium(String nome, String cpf, int ano, int mes, int dia, int codTema) {
        super(nome, cpf, ano, mes, dia, codTema);
    }

    @Override
    public void retornaTema(Museu museu) {
        super.retornaTema(museu);
    }

    @Override
    public void retornaItens(Museu museu) {
        super.retornaItens(museu);
    }
}
