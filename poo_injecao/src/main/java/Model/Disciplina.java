package Model;

import Interfaces.IDisciplinaServices;

import java.util.ArrayList;

public abstract class Disciplina implements IDisciplinaServices {
    public String nome;
    public int id;
    public String conteudo;

    public ArrayList<Aluno> Alunos = new ArrayList<Aluno>(); //Herança
    @Override
    public void buscaAluno() {
        for (Aluno aluno: this.Alunos) {
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Curso: " + aluno.curso);
            System.out.println("Matrícula: " + aluno.matricula);
            System.out.println("---------------------------------");
        }
    }

    @Override
    public void buscaAlunoPorId(int matricula) {
        for (Aluno aluno: this.Alunos) {
            if (aluno.matricula == matricula){
                System.out.println("Nome: " + aluno.nome);
                System.out.println("Curso: " + aluno.curso);
                System.out.println("Matrícula: " + aluno.matricula);
                System.out.println("---------------------------------");
            }
        }
    }

    @Override
    public void adicionaAluno(Aluno aluno) {
        this.Alunos.add(aluno);
    }

    @Override
    public void deletaAluno(Aluno aluno) {
        this.Alunos.remove(aluno);
    }
}
