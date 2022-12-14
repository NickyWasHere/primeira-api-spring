package br.com.mesttra.primeiraapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import br.com.mesttra.primeiraapi.entity.Aluno;
import br.com.mesttra.primeiraapi.service.AlunoService;

@RestController
@RequestMapping ("/alunos")
public class AlunoController {

	@Autowired
	AlunoService service;
	
	@PostMapping
	@ResponseStatus (code = HttpStatus.CREATED)
	public void cadastrarAluno(@RequestBody Aluno aluno) {
		service.cadastrarAluno(aluno);;
	}
	
	@GetMapping (path = "/{matricula}")
	public Aluno verAluno(@PathVariable Long matricula) {
		return service.verAluno(matricula);
	}
	
	@GetMapping (path = "/{cpf}/busca-cpf")
	public Aluno verAlunoPorCpf(@PathVariable String cpf) {
		return service.verAlunoPorCpf(cpf);
	}
	
	@GetMapping
	public List<Aluno> verTodos() {
		return service.verTodos();
	}
	
	@PutMapping (path = "/{matricula}")
	public void atualizarAluno(@PathVariable Long matricula, @RequestBody Aluno aluno) {
		service.atualizarAluno(aluno);
	}
	
	@DeleteMapping (path = "/{matricula}")
	public void excluirAluno(@PathVariable Long matricula) {
		service.excluirAluno(matricula);
	}
}
