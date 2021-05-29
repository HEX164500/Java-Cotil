package app.models;

public class Aluno implements Comparable<Integer> {

	private int RA;
	private String nome;
	private Integer idade;

	public Aluno(int RA, String nome, int idade) {
		super();
		this.RA = RA;
		this.nome = nome;
		this.idade = idade;
	}

	public int getRA() {
		return RA;
	}

	public void setRA(int rA) {
		RA = rA;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aluno [RA=" + RA + ", nome=" + nome + ", idade=" + idade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + RA;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (RA != other.RA)
			return false;
		return true;
	}

	@Override
	public int compareTo(Integer idade) {
		return this.idade.compareTo(idade);
	}
}
