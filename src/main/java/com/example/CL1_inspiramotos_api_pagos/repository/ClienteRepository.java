package com.example.CL1_inspiramotos_api_pagos.repository;

import com.example.CL1_inspiramotos_api_pagos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
