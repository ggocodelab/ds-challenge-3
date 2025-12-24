package com.ggocodelab.ds_challenge_3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ggocodelab.ds_challenge_3.dto.ClientDTO;
import com.ggocodelab.ds_challenge_3.entities.Client;
import com.ggocodelab.ds_challenge_3.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAll(Pageable pageable){
		Page<Client> clients = repository.findAll(pageable);
		return clients.map(x -> new ClientDTO(x));
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> result = repository.findById(id);
		Client client = result.get();
		ClientDTO dto = new ClientDTO(client);
		return dto;		
	}
	
	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client entity = new Client();
		copyToEntity(dto, entity);
		entity = repository.save(entity);
		return new ClientDTO(entity);		
	}
	
	@Transactional
	public ClientDTO update(Long id, ClientDTO dto) {
		Client entity = repository.getReferenceById(id);
		copyToEntity(dto, entity);
		entity = repository.save(entity);
		return new ClientDTO(entity);
	}
	
	@Transactional
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	
	
	private void copyToEntity(ClientDTO dto, Client entity) {
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setBirthDate(dto.getBirthDate());
		entity.setChildren(dto.getChildren());		
	}
}
