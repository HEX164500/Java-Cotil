package app.models;

public abstract class Produto {

	private String descricao;

	public Produto(String descricao) {
		setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if( descricao == null )
			throw new NullPointerException("Descrição não pode ser nulo");
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + "]";
	}

}
