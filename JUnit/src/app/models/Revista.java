package app.models;

public class Revista extends Produto {
	private String ISSN;

	public Revista(String descricao, String ISSN) {
		super(descricao);
		setISSN(ISSN);
	}

	public String getISSN() {
		return ISSN;
	}

	public void setISSN(String ISSN) {
		if( ISSN == null )
			throw new NullPointerException("ISSN não pode ser nulo");
		this.ISSN = ISSN;
	}

	@Override
	public String toString() {
		return "Revista [ISSN=" + ISSN + ", Descricao()=" + getDescricao() + "]";
	}
}
