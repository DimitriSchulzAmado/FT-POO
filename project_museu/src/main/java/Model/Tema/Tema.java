package Model.Tema;

public class Tema {
    private String nome;
    public static int codigo = 0;
    private int itens_expostos;

    public Tema(String nome, int itens_expostos) {
        this.nome = nome;
        this.itens_expostos = itens_expostos;
        codigo ++;
    }

    public String getNome() {
        return nome;
    }

    public int getItens_expostos() {
        return itens_expostos;
    }

}
