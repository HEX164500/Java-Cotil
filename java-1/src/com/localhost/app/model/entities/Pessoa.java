package com.localhost.app.model.entities;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.localhost.app.model.entities.exceptions.DataInvalidaException;

/**
 * Representa a entidade Pessoa no sistema
 * @author lucas
 * @version 0.1
 */
public final class Pessoa  implements Serializable{

	private static final long serialVersionUID = 1L;

	private String  nome;
	private Date    nascimento;
	private Integer idade;
	private final static SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");

	public Pessoa () {
	}

	public Pessoa(String nome, Date nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

	/**
	 * @param nome da pessoa
	 * @param data data como String no formato (dd/MM/yyyy)
	 * @throws DataInvalidaException caso seja data invalida ou no futuro
	 */
	public Pessoa( String nome, String data ) throws DataInvalidaException {
		this.nome = nome;
		calculaIdadeDe(data);
	}

	/**
	 * atribui a idade, o calculo realizado entre a data de nascimento fornecida e o dia atual
	 * @param date_pattern uma string contendo a dada de nascimento no formato (dd/MM/yyyy)
	 * @throws DataInvalidaException caso a data seja no futuro ou invalida
	 */
	public void calculaIdadeDe( String data ) throws DataInvalidaException {
		try {
			nascimento = dateFormatter.parse(data);
			Date today = new Date(); 

			if ( nascimento.after( today ) ) throw new DataInvalidaException("Você é do futuro por acaso ?");
			
			long dateDiff = today.getTime() - nascimento.getTime();
			
			this.idade = (int) Math.round( TimeUnit.DAYS.convert(dateDiff, TimeUnit.MILLISECONDS) / 365 );

		}catch ( ParseException parse_err ) {
			throw new DataInvalidaException("Data inválida fornecida");
		}
	}

	/**
	 * Apelido para getIdade()
	 * @return idade
	 */
	public Integer informaIdade() {
		return idade;
	}

	/**
	 * Apelido para getNome()
	 * @return nome
	 */
	public String informaNome() {
		return nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", nascimento: " + dateFormatter.format(nascimento) + ", Idade: " + idade + " anos";
	}
}
