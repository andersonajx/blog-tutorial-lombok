package br.com.teste;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

public final class Pessoa implements Serializable {

	private static final long serialVersionUID = 999692124750593128L;

	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PROTECTED)
	private String nome;
	@Getter
	private String email;
	@Setter
	private String telefone;
	@Getter
	@Setter
	private Date nascimento;

	public Pessoa() {
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

}
