package Interfaces;

import Model.Aluno;

public interface IDisciplinaServices {
    public void buscaAluno();
    public void buscaAlunoPorId(int matricula);
    public void adicionaAluno(Aluno aluno);
    public void deletaAluno(Aluno aluno);
}
