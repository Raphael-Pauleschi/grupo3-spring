package com.fatec.grupo3.services;

import com.fatec.grupo3.model.Cliente;
import java.util.List;
import java.util.Optional;

public interface MantemCliente {
	List<Cliente> consultaTodos();

	Optional<Cliente> consultaPorCpf(String cpf);

	Optional<Cliente> consultaPorId(Long id);

	Optional<Cliente> save(Cliente cliente);

	void delete(Long id);

	Optional<Cliente> atualiza(Cliente cliente);
}
