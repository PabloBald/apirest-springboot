package com.pablo.webapi.Api.Controllers;

import com.pablo.webapi.DTOs.PeliculaDTO;
import com.pablo.webapi.Services.ServicesImplementations.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping
    public List<PeliculaDTO> listarPeliculas(){
        return peliculaService.listarPeliculas();
    }
}
