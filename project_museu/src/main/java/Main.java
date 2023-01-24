import Model.Museu;
import Model.Tema.Tema;
import Model.Vistante.*;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Museu museu = new Museu();

        Tema tema1 = new Tema("Vintage",135);
        Tema tema2 = new Tema("Numismatica",300);
        Tema tema3 = new Tema("Historia da Muisica",67);
        Tema tema4 = new Tema("Pinturas",72);
        Tema tema5 = new Tema("Esculturas",46);

        museu.addTema(tema1);
        museu.addTema(tema2);
        museu.addTema(tema3);
        museu.addTema(tema4);
        museu.addTema(tema5);

        VisitantePremium visitante5 = new VisitantePremium("Pedro","1231231",2000,11,16,1);
        VisitantePremium visitante4 = new VisitantePremium("Milton","23167187",1998,07,22,3);
        Visitante visitante1 = new Visitante("Lucas","123456",2002,06,25,4);
        Visitante visitante2 = new Visitante("Marcos","178350",2001,8,15,2);
        Visitante visitante3 = new Visitante("Melyssa","098754",1999,07,28,5);

        visitante1.retornaTema(museu);
        visitante2.retornaTema(museu);
        visitante3.retornaTema(museu);
        visitante4.retornaTema(museu);
        visitante5.retornaTema(museu);

        visitante1.retornaItens(museu);
        visitante2.retornaItens(museu);
        visitante3.retornaItens(museu);
        visitante4.retornaItens(museu);
        visitante5.retornaItens(museu);
    }
}
