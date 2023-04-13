package com.developermarcelo;

import com.developermarcelo.desafio.dominio.Curso;
import com.developermarcelo.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Desafio Java POO");
        curso.setDescricao("Pequeno desafio poo dio java bootcamp");
        curso.setCargaHoraria(80);

        System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("Desafio Kotlin POO");
        curso2.setDescricao("Pequeno desafio poo dio Kotlin bootcamp");
        curso2.setCargaHoraria(180);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Hoje");
        mentoria.setDescricao("Acontencendo agora");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}