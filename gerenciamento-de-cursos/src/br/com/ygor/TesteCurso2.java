package br.com.ygor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {

    public static void main(String[] args) {

        Curso curso = new Curso("Java", "Zé");
        curso.add(new Aula("OO", 21));
        curso.add(new Aula("Poli", 30));

        List<Aula> aulasImutaveis = curso.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);

        System.out.println(aulas);
        System.out.println(curso.getTempoTotal());
        System.out.println(curso);

    }


}
