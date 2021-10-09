package com.claudio.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claudio.cursomc.domain.Cliente ;
import com.claudio.cursomc.repositories.ClienteRepository;
import com.claudio.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente  buscarPorId(Integer id) {
		Optional<Cliente > obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente .class.getName()));
	}
}
