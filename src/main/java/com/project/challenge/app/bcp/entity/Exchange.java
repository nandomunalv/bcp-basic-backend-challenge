package com.project.challenge.app.bcp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_exchage")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Exchange {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "monto")
	private double monto;
	
	@Column(name = "nuevo_monto")
	private double nuevoMonto;
	
	@Column(name = "moneda_origen")
	private String monedaOrigen;
	
	@Column(name = "moneda_destino")
	private String monedaDestino;
	
	@Column(name = "tipo_cambio")
	private double tipoCambio;
	
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
}
