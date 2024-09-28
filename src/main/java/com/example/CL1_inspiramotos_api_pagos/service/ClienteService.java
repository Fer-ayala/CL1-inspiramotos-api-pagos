package com.example.CL1_inspiramotos_api_pagos.service;

import com.example.CL1_inspiramotos_api_pagos.model.Cliente;
import com.example.CL1_inspiramotos_api_pagos.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClienteService implements IClienteService {

    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
}
