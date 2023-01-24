package Services;

import Interfaces.IDisciplinaServices;
import Model.Aluno;

public class DisciplinaServices {
    private IDisciplinaServices _disciplinaservices;

    public DisciplinaServices(IDisciplinaServices disciplinaServices){
        this._disciplinaservices = disciplinaServices;
    }

    public void listaAlunos(){
        this._disciplinaservices.buscaAluno();
    }

    public void adicionaAluno(Aluno aluno) {
        this._disciplinaservices.adicionaAluno(aluno);
    }

    public void buscaAlunoPorMatricula(int matricula){
        this._disciplinaservices.buscaAlunoPorId(matricula);
    }

    public void excluirAluno(Aluno aluno){
        this._disciplinaservices.deletaAluno(aluno);
    }
}
