package br.com.ygor;

import java.util.function.Consumer;

public class TesteCurso {

    public static void main(String[] args) {

        Curso curso = new Curso("Java", "Zé");
        curso.add(new Aula("OO", 21));
        curso.add(new Aula("Poli", 30));

        curso.getAulas().forEach(System.out::println);

    }

}
