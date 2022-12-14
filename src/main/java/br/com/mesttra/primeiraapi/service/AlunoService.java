package br.com.mesttra.primeiraapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mesttra.primeiraapi.entity.Aluno;
import br.com.mesttra.primeiraapi.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	AlunoRepository repository;
	
	//CREATE
	public void cadastrarAluno(Aluno aluno) {
		if (repository.existsById(aluno.getMatricula()))
			return;
		
		repository.save(aluno);
	}
	
	//READ
	public Aluno verAluno(Long matricula) {
		Optional<Aluno> alunoCadastrado = repository.findById(matricula);
		
		if (alunoCadastrado.isEmpty())
			return null;
		
		return alunoCadastrado.get();
	}
	
	public Aluno verAlunoPorCpf(String cpf) {
		Optional<Aluno> alunoCadastrado = repository.findByCpf(cpf);
		
		if (alunoCadastrado.isEmpty())
			return null;
		
		return alunoCadastrado.get();
	}
	
	public List<Aluno> verTodos() {
		return (List<Aluno>) repository.findAll();
	}
	
	//UPDATE
	public void atualizarAluno(Aluno aluno) {
		if (!repository.existsById(aluno.getMatricula()))
			return;
		
		repository.save(aluno);
	}
	
	//DELETE
	public void excluirAluno(Long matricula) {
		if (!repository.existsById(matricula))
			return;
		
		repository.deleteById(matricula);
	}
	
}
