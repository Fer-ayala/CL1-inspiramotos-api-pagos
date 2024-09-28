package com.example.CL1_inspiramotos_api_pagos.controller;

import com.example.CL1_inspiramotos_api_pagos.model.Cliente;
import com.example.CL1_inspiramotos_api_pagos.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path="apimotos/v1/clientes")
public class ClienteController {

    private ClienteService clienteService;

    @GetMapping("")
    public List<Cliente> obtenerClientes(){
        return clienteService.listarClientes();
    }

}
