package app.models;

import app.interfaces.Autenticar;

public class RevistaDigital extends Revista implements Autenticar{
	private String DOI;

	public RevistaDigital(String descricao, String ISSN, String DOI) {
		super(descricao, ISSN);
		this.DOI = DOI;
	}

	public String getDOI() {
		return DOI;
	}

	public void setDOI(String DOI) {
		this.DOI = DOI;
	}

	@Override
	public String toString() {
		return "RevistaDigital [DOI=" + DOI + ", ISSN()=" + getISSN() + ", Descricao()=" + getDescricao() + "]";
	}
}
