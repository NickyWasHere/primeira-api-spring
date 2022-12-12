package br.com.mesttra.primeiraapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.mesttra.primeiraapi.entity.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {

}
