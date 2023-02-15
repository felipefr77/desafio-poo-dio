package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso("Curso Java", "Descrição do curso Java",8);
		Curso curso2 = new Curso("Curso Js", "Descrição do curso Js",4);

		Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição da Mentoria de Java", LocalDate.now());

		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devFelipe = new Dev("Felipe Fruhauf");
		devFelipe.inscreverBoocamp(bootcamp);
		System.out.println("Conteúdos incritos do Dev " + devFelipe.getNome() + " " + devFelipe.getConteudosInscritos());
		devFelipe.progredir();
		devFelipe.progredir();
		System.out.println("Progrediu");
		System.out.println("Conteúdos incritos do Dev " + devFelipe.getNome() + " " + devFelipe.getConteudosInscritos());
		System.out.println("Conteúdos concluídos do Dev " + devFelipe.getNome() + " " + devFelipe.getConteudosConcluidos());
		System.out.print("XP: " + devFelipe.calcularTotalXp());

		System.out.println("");
		System.out.println("");
		System.out.println("##########################################");
		System.out.println("");

		Dev devFulano = new Dev("Fulano da Silva");
		devFulano.inscreverBoocamp(bootcamp);
		System.out.println("Conteúdos incritos do Dev " + devFulano.getNome() + " " + devFulano.getConteudosInscritos());
		devFulano.progredir();
		devFulano.progredir();
		devFulano.progredir();
		System.out.println("Progrediu");
		System.out.println("Conteúdos incritos do Dev " + devFulano.getNome() + " " + devFulano.getConteudosInscritos());
		System.out.println("Conteúdos concluídos do Dev " + devFulano.getNome() + " " + devFulano.getConteudosConcluidos());
		System.out.print("XP: " + devFulano.calcularTotalXp());
	}
}
