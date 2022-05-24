package com.algaworks.algalog.api.exceptionhandler;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@JsonInclude(Include.NON_NULL)
@Setter
@Getter
public class Problema {

	private int status;
	private OffsetDateTime dataHora;
	private String titulo;
	private List<Campo> campos;

	@Getter
	@AllArgsConstructor
	public static class Campo {
		
		private String campo;
		private String mensagem;
	}
	
	

}
