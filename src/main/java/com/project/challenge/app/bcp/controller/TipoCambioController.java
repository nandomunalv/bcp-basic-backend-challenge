package com.project.challenge.app.bcp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.challenge.app.bcp.entity.TipoCambio;
import com.project.challenge.app.bcp.service.TipoCambioService;

@RestController
@RequestMapping(value = "/api/tipo-cambio")
public class TipoCambioController {

	@Autowired
	private TipoCambioService service;
	
	@GetMapping("/list")
	public List<TipoCambio> listar() {
		return service.findAll();
	}
}
