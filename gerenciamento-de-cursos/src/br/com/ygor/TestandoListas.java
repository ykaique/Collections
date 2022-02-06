package br.com.ygor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;

public class TestandoListas {

    public static void main(String[] args) {
        // write your code here
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalahando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);
        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);

        System.out.println("Primeira Aula: " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula: " + aulas.get(i));
        }

        aulas.forEach(s -> System.out.println("Aulas: " + s));

        aulas.add("Aumentando nosso conhecimento");
        Collections.sort(aulas);
        aulas.forEach(System.out::println);

    }
}
