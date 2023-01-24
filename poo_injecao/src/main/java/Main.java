import Model.Aluno;
import Model.Disciplina;
import Model.Disciplinas.Algoritmos;
import Model.Disciplinas.BancoDeDados;
import Services.DisciplinaServices;

public class Main {
    public static void main(String[] args) {
        Aluno Aluno1 = new Aluno("Flavio", "GEC", 1450);
        Aluno Aluno2 = new Aluno("Pamela", "GET", 3000);

        Algoritmos algoritmos = new Algoritmos();
        BancoDeDados bancodedados = new BancoDeDados();

        DisciplinaServices DisciplinaServices1 = new DisciplinaServices(algoritmos);
        DisciplinaServices DisciplinaServices2 = new DisciplinaServices(bancodedados);

        DisciplinaServices1.listaAlunos();
        System.out.println("---------------------------");

        DisciplinaServices1.adicionaAluno(Aluno1);
        DisciplinaServices1.adicionaAluno(Aluno2);
        System.out.println("Listando todos os alunos: ");
        DisciplinaServices1.listaAlunos();
        System.out.println("Busca de aluno por matricula: ");
        DisciplinaServices1.buscaAlunoPorMatricula(3000);
        System.out.println("Excluindo aluno: ");
        DisciplinaServices1.excluirAluno(Aluno1);
        System.out.println("Listando todos os alunos");
        DisciplinaServices1.listaAlunos();
    }
}
