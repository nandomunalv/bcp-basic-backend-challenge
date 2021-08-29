package com.project.challenge.app.bcp.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.challenge.app.bcp.entity.TipoCambio;
import com.project.challenge.app.bcp.repository.TipoCambioRepository;
import com.project.challenge.app.bcp.service.dto.AddExchangeRateRequest;

import io.reactivex.Single;

@Service
public class TipoCambioServiceImpl implements TipoCambioService{
	@Autowired
	private TipoCambioRepository tipoCambioRepository;

	@Override
	public List<TipoCambio> findAll() {
		return tipoCambioRepository.findAll();
	}

	@Override
	public Single<String> addTipoCambio(AddExchangeRateRequest addExchangeRateRequest) {
		return addTipoCambioToRepository(addExchangeRateRequest);
	}
	
	private Single<String> addTipoCambioToRepository(AddExchangeRateRequest addExchangeRateRequest) {
		return Single.create(singleSubscribe -> {
			tipoCambioRepository.save(toTipoCambio(addExchangeRateRequest));
			singleSubscribe.onSuccess("ok");
		});
	}
	
	private TipoCambio toTipoCambio(AddExchangeRateRequest addExchangeRateRequest) {
		TipoCambio tipoCambio = new TipoCambio();
		BeanUtils.copyProperties(addExchangeRateRequest, tipoCambio);
		return tipoCambio;
	}
}
