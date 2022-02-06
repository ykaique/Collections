package br.com.ygor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Java", 20);
        Aula a2 = new Aula("Angular", 45);
        Aula a3 = new Aula("MySQL", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(aulas);
        aulas.sort(Comparator.comparingInt(Aula::getTempo));
        System.out.println(aulas);
    }

}
