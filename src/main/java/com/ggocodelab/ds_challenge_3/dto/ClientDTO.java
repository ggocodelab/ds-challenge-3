package com.ggocodelab.ds_challenge_3.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ggocodelab.ds_challenge_3.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@JsonPropertyOrder({ "id", "name", "cpf", "income", "birthDate", "children"})
public class ClientDTO {
	
	private Long id;
	
	@Size(min = 3, max = 120, message = "Minimum of 3 and maximum of 120 characters.")
	@NotBlank(message = "Required field.")
	private String name;
	
	@NotBlank(message = "Required field.")
	private String cpf;
	
	@Positive(message = "The value must be positive.")
	private Double income;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent(message = "Birthdate must be in the past or present.")
	private LocalDate birthDate;
	
	@Positive(message = "Blank or positive values only")
	private Integer children;
	
	public ClientDTO() {
	}

	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}
}
