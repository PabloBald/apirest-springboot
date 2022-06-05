package com.pablo.webapi.Services.ServicesImplementations;

import com.pablo.webapi.DTOs.PeliculaDTO;
import com.pablo.webapi.Data.Repositories.IPeliculaRepository;
import com.pablo.webapi.Domain.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeliculaService {

    @Autowired
    private IPeliculaRepository peliculaRepository;

    public List<PeliculaDTO> listarPeliculas(){

       List<PeliculaDTO> listaDTO = new ArrayList<>();
       Iterable<Pelicula>listaPeliculas = peliculaRepository.findAll();
        for (Pelicula p : listaPeliculas
             ) {
            listaDTO.add(this.convertirEntidadADTO(p));
        }
        return  listaDTO;
    }

    private PeliculaDTO convertirEntidadADTO(Pelicula p){
        PeliculaDTO peliculaDTO = new PeliculaDTO();
        peliculaDTO.setPoster(p.getPoster());
        peliculaDTO.setSinopsis(p.getSinopsis());
        peliculaDTO.setTitulo(p.getTitulo());
        peliculaDTO.setTrailer(p.getTrailer());

    return peliculaDTO;
    }
}
