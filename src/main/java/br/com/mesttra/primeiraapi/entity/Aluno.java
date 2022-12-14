package br.com.mesttra.primeiraapi.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.*;

@Entity
public class Aluno {
	@Id
	private long matricula;
	
	@Column (nullable = false)
	private String nome;
	
	@Column (name = "data_nascimento", nullable = false)
	@DateTimeFormat (iso = ISO.DATE_TIME)
	private LocalDate dataNascimento;
	
	@Column (unique = true)
	private String cpf;
	
	@Column (name = "valor_mensalidade", nullable = false)
	private Double valorMensalidade;

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(Double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
}
