package app.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Escola {

	private final Set<Aluno> matricula = new HashSet<>();

	private int maisVelho, maisNovo;

	public Escola(List<Aluno> alunos) {
		matricula.addAll(alunos);
		analisa();
	}

	public Escola() {
		this.maisVelho = this.maisNovo = 0;
	}

	public void analisa() {
		this.maisVelho = matricula.stream().map(a -> a.getIdade()).max(Integer::compareTo).orElse(0);
		this.maisNovo = matricula.stream().map(a -> a.getIdade()).min(Integer::compareTo).orElse(0);
	}

	public int getMaisVelho() {
		return maisVelho;
	}

	public int getMaisNovo() {
		return maisNovo;
	}

	public void addMatricula(Aluno aluno) {
		matricula.add(aluno);
		analisa();
	}

	public Set<Aluno> getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Escola [maisVelho=" + maisVelho + ", maisNovo=" + maisNovo + "]";
	}

}
