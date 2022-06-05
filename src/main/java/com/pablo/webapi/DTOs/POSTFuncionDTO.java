package com.pablo.webapi.DTOs;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class POSTFuncionDTO {
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date fecha;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "HH:mm")
    private Date horario;
    private Long peliculaId;
    private Long salaId;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Long getPeliculaId() {
        return peliculaId;
    }
    public void setPeliculaId(Long peliculaId) {
        this.peliculaId = peliculaId;
    }

    public Long getSalaId() {
        return salaId;
    }

    public void setSalaId(Long salaId) {
        this.salaId = salaId;
    }
}
