package br.com.mesttra.primeiraapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.mesttra.primeiraapi.entity.Aluno;
import br.com.mesttra.primeiraapi.repository.AlunoRepository;

@RestController
@RequestMapping ("/alunos")
public class AlunoController {

	@Autowired
	AlunoRepository repository;
	
	@PostMapping
	public void cadastrarAluno(@RequestBody Aluno aluno) {
		repository.save(aluno);
	}
	
	@GetMapping (path = "/{matricula}")
	public Optional<Aluno> verAluno(@PathVariable Long matricula) {
		return repository.findById(matricula);
	}
	
	@GetMapping
	public List<Aluno> verTodos() {
		return (List<Aluno>) repository.findAll();
	}
	
	@DeleteMapping (path = "/{matricula}")
	public void excluirAluno(@PathVariable Long matricula) {
		repository.deleteById(matricula);
	}
}
