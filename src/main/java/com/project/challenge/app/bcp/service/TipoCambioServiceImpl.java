package com.project.challenge.app.bcp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.challenge.app.bcp.entity.TipoCambio;
import com.project.challenge.app.bcp.repository.TipoCambioRepository;

@Service
public class TipoCambioServiceImpl implements TipoCambioService{
	
	@Autowired
	private TipoCambioRepository tipoCambioRepository;

	@Override
	public List<TipoCambio> findAll() {
		return tipoCambioRepository.findAll();
	}
	
	

}
