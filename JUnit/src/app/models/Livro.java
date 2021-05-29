package app.models;

public class Livro extends Produto {
	private Integer ISBN;

	public Livro(String descricao, Integer ISBN) {
		super(descricao);
		setISBN(ISBN);
	}

	public Integer getISBN() {
		return ISBN;
	}

	public void setISBN(Integer ISBN) {
		if( ISBN == null )
			throw new NullPointerException("ISBN não pode ser nulo");
		if ( ISBN < 0 )
			throw new IllegalArgumentException("ISBN não pode ser negativo");
		this.ISBN = ISBN;
	}

	@Override
	public String toString() {
		return "Revista [ISBN=" + ISBN + ", Descricao()=" + getDescricao() + "]";
	}
}
