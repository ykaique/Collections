package br.com.ygor;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Zéca");
        alunos.add("Jão");
        alunos.add("Japa");
        alunos.add("Eu");
        alunos.add("Ele");

        System.out.println(alunos);
        alunos.forEach(System.out::println);
    }

}
