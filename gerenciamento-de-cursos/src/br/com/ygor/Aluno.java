package br.com.ygor;

import java.util.Map;
import java.util.Objects;

public class Aluno {

    private String nome;
    private String cpf;
    int matricula;

    public Aluno(String nome, String cpf, int matricula) {
        if (nome == null){
            throw new NullPointerException("Nao pode ser nulo");
        }

        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula &&
                Objects.equals(nome, aluno.nome) &&
                Objects.equals(cpf, aluno.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
