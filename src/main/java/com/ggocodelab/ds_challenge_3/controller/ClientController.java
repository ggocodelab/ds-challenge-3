package com.ggocodelab.ds_challenge_3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ggocodelab.ds_challenge_3.dto.ClientDTO;
import com.ggocodelab.ds_challenge_3.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public ResponseEntity<Page<ClientDTO>> findAll(Pageable pageable) {
		Page<ClientDTO> dto = service.findAll(pageable);
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping(value="/{id}")
	public ClientDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public ClientDTO insert(@RequestBody ClientDTO dto) {
		return service.insert(dto);
	}

}
