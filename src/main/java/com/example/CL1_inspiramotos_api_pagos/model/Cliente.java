package com.example.CL1_inspiramotos_api_pagos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name="clientes")
public class Cliente {

    @Id
    private int idCliente;
    private String nombre;
    private String email;
    private String telefono;
    private String fechaRegistro;
}
