package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Conceitos e prática sobre Programação Orientada a Objetos - POO");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de JavaScript");
        curso1.setDescricao("Conceitos e prática sobre a Linguagem de Programação JavaScript");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Abordar conceitos da Programação Orientada a Objetos.");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de JavaScript");
        mentoria1.setDescricao("Abordar conceitos da Linguagem de Programação JavaScript.");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);
        System.out.println(mentoria1);

    }
}
