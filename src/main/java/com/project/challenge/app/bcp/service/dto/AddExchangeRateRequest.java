package com.project.challenge.app.bcp.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddExchangeRateRequest {
	String monedaOrigen;
	String monedaDestino;
	double tipoCambio;
}
