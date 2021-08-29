package com.project.challenge.app.bcp.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddExchangeRateWebRequest {
	String monedaOrigen;
	String monedaDestino;
	double tipoCambio;
}
