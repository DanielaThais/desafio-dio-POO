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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Trilha completa de cursos da Linguagem de Programação Java.");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Daniela Thais");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos de " + dev.getNome() + ": " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("---------------------------------------------------------");
        System.out.println("\nConteúdos Inscritos de " + dev.getNome() + ": " + dev.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos de " + dev.getNome() + ": " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp() + "\n");

        System.out.println(">==> >=> >==> >=> >==> >=> >==> >=> >==> >=> >==> >=> >==> >=> >==>");
        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("---------------------------------------------------------");
        System.out.println("\nConteúdos Inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
    }
}
