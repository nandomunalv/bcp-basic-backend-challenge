package com.project.challenge.app.bcp.service;

import java.util.List;

import com.project.challenge.app.bcp.entity.TipoCambio;
import com.project.challenge.app.bcp.service.dto.AddExchangeRateRequest;

import io.reactivex.Single;

public interface TipoCambioService {
	
	List<TipoCambio> findAll();
	
	Single<String> addTipoCambio(AddExchangeRateRequest addExchangeRateRequest);
	
}
