package com.pablo.webapi.DTOs;

import com.pablo.webapi.Domain.Sala;


import java.util.Date;

public class FuncionDTO {
    private Date fecha;
    private Date horario;
    private Long peliculaId;
    private Sala sala;

    public FuncionDTO() {
    }

    public Long getPeliculaId() {
        return peliculaId;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getHorario() {
        return horario;
    }

    public Sala getSala() {
        return sala;
    }
}
