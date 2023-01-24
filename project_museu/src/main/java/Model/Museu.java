package Model;

import Model.Tema.Tema;

import java.util.ArrayList;

public class Museu {
    ArrayList<Tema> temas = new ArrayList<>();

    public void addTema(Tema tema){
        temas.add(tema);
    }

    public ArrayList<Tema> getTemas() {
        return temas;
    }
}
