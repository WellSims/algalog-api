package com.algaworks.algalog.model.input;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcorreciaInput {

	@NotBlank
	private String descricao;
}
