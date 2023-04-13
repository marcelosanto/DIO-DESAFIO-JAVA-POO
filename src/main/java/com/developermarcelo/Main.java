package com.developermarcelo;

import com.developermarcelo.desafio.dominio.BootCamp;
import com.developermarcelo.desafio.dominio.Curso;
import com.developermarcelo.desafio.dominio.Dev;
import com.developermarcelo.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Desafio Java POO");
        curso.setDescricao("Pequeno desafio poo dio java bootcamp");
        curso.setCargaHoraria(80);

        //System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("Desafio Kotlin POO");
        curso2.setDescricao("Pequeno desafio poo dio Kotlin bootcamp");
        curso2.setCargaHoraria(75);

        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Hoje");
        mentoria.setDescricao("Acontencendo agora");
        mentoria.setData(LocalDate.now());

        //System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descriçao Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos DevMarcelo: " + devMarcelo.getConteudosInscritos());
        devMarcelo.progredir();
        System.out.println("Conteudos Inscritos DevAlice: " + devMarcelo.getConteudosInscritos());
        System.out.println("Conteudos Conluidos DevAlice: " + devMarcelo.getConteudosConcluidos());
        System.out.println("XP: " + devMarcelo.calcularXp());

        System.out.println(" ");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println(" ");

        Dev devAlice = new Dev();
        devAlice.setNome("Alice");
        devAlice.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos DevAlice: " + devAlice.getConteudosInscritos());
        devAlice.progredir();
        devAlice.progredir();
        System.out.println("Conteudos Inscritos DevAlice: " + devAlice.getConteudosInscritos());
        System.out.println("Conteudos Conluidos DevAlice: " + devAlice.getConteudosConcluidos());
        System.out.println("XP: " + devAlice.calcularXp());

    }
}