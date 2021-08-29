package com.project.challenge.app.bcp.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.challenge.app.bcp.controller.dto.AddExchangeRateWebRequest;
import com.project.challenge.app.bcp.controller.dto.BaseWebResponse;
import com.project.challenge.app.bcp.entity.TipoCambio;
import com.project.challenge.app.bcp.service.TipoCambioService;
import com.project.challenge.app.bcp.service.dto.AddExchangeRateRequest;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

@RestController
@RequestMapping(value = "/api/tipo-cambio")
public class TipoCambioController {

	@Autowired
	private TipoCambioService service;
	
	@GetMapping("/list")
	public List<TipoCambio> listar() {
		return service.findAll();
	}
	
	@PostMapping()
	public Single<ResponseEntity<BaseWebResponse>> addTipoCambio(@RequestBody AddExchangeRateWebRequest addExchangeRateWebRequest) {
		return service.addTipoCambio(toAddTipoCambioRequest(addExchangeRateWebRequest))
				.subscribeOn(Schedulers.io())
				.map(s -> ResponseEntity.created(URI.create("/api/tipo-cambio" + s))
						.body(BaseWebResponse.successNoData()));
	}
	
	private AddExchangeRateRequest toAddTipoCambioRequest(AddExchangeRateWebRequest addExchangeRateWebRequest) {
		AddExchangeRateRequest rateRequest = new AddExchangeRateRequest();
		BeanUtils.copyProperties(addExchangeRateWebRequest, rateRequest);
		return rateRequest;
	}
}


















