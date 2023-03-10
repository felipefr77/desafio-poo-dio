package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;

	public Curso(String titulo, String descricao, int cargaHoraria) {
		setTitulo(titulo);
		setDescricao(descricao);
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso{titulo='" + getTitulo() + "', descrição='" + getDescricao() + "', cargaHoraria=" + cargaHoraria + "}";
	}
}
