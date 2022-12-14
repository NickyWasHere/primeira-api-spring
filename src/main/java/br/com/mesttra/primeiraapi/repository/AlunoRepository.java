package br.com.mesttra.primeiraapi.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.mesttra.primeiraapi.entity.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {

	Optional<Aluno> findByCpf(String cpf);
}
