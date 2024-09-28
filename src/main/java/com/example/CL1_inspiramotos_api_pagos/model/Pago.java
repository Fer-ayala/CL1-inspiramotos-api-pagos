package com.example.CL1_inspiramotos_api_pagos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Pagos")
public class Pago {

    @Id
    private int idPago;
    private int idCliente;  // No es una relación directa pero se usa como referencia
    private double monto;
    private String fechaPago;  // Puede ser un tipo `Date` en vez de `String`
    private String metodoPago;
}
