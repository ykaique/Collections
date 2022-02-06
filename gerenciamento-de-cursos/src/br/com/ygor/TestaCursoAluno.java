package br.com.ygor;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoAluno {

    public static void main(String[] args) {
        Curso curso = new Curso("Java", "Zé");
        curso.add(new Aula("OO", 21));
        curso.add(new Aula("Poli", 30));

        Aluno aluno1 = new Aluno("Ygor", "4787", 123);
        Aluno aluno2 = new Aluno("Kaue", "123", 124);
        Aluno aluno3 = new Aluno("Zé", "789", 125);

        curso.matricular(aluno1);
        curso.matricular(aluno2);
        curso.matricular(aluno3);

        System.out.println("Alunos matriculados: ");
        curso.getAlunos().forEach(System.out::println);

        Aluno ygor = new Aluno("Ygor", "4787", 123);


        System.out.println("O aluno " + ygor + " esta matriculado ?");
        System.out.println(curso.estaMatriculado(ygor));


        System.out.println(aluno1.equals(ygor));

        Set<Aluno> alunos = curso.getAlunos();

        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
