package com.pablo.webapi.Services.Interfaces;

import com.pablo.webapi.DTOs.PeliculaDTO;

import java.util.List;

public interface IPeliculaService {
    PeliculaDTO obtenerPorId(Long id);
    PeliculaDTO crear(PeliculaDTO p);
    List<PeliculaDTO> listarTodas();
}
