package com.fatec.grupo3.model;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	Optional<Cliente> findByCpf(String cpf);

	List<Cliente> findAllByNomeIgnoreCaseContaining(String nome);
}