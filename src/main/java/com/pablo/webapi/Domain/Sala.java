package com.pablo.webapi.Domain;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "salas")
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sala_id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    private int capacidad;

    @OneToMany(cascade= CascadeType.ALL,mappedBy = "sala")
    private Collection<Funcion> funciones;
}
