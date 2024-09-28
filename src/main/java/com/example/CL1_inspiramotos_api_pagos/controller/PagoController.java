package com.example.CL1_inspiramotos_api_pagos.controller;

import com.example.CL1_inspiramotos_api_pagos.model.Pago;
import com.example.CL1_inspiramotos_api_pagos.service.PagoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path="apimotos/v1/pagos")
public class PagoController {

    private PagoService pagoService;

    @GetMapping("")
    public List<Pago> obtenerPagos(){
        return pagoService.listarPagos();
    }

}
