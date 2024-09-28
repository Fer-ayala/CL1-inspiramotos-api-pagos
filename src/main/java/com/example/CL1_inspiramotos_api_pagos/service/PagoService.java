package com.example.CL1_inspiramotos_api_pagos.service;

import com.example.CL1_inspiramotos_api_pagos.model.Pago;
import com.example.CL1_inspiramotos_api_pagos.repository.PagoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PagoService implements IPagoService{

    private PagoRepository pagoRepository;

    @Override
    public List<Pago> listarPagos() {
        return pagoRepository.findAll();
    }
}
