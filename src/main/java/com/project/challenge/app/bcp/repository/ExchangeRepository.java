package com.project.challenge.app.bcp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.challenge.app.bcp.entity.Exchange;

@Repository
public interface ExchangeRepository extends JpaRepository<Exchange, Long> {

}
