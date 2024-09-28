package com.example.CL1_inspiramotos_api_pagos.repository;

import com.example.CL1_inspiramotos_api_pagos.model.Cliente;
import com.example.CL1_inspiramotos_api_pagos.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {
}
