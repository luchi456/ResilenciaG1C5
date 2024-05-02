package com.example.mspedidoservice.entity;

import com.example.mspedidoservice.dto.ClienteDto;
import com.example.mspedidoservice.dto.ProductoDto;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PedidoDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double cantidad;
    private Double precio;
    private Integer productoId;

    public PedidoDetalle() {
        this.cantidad = (double) 0;
        this.precio = (double) 0;
    }
    @Transient
    ProductoDto productoDto;
}