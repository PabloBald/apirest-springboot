package com.pablo.webapi.Data.Repositories;

import com.pablo.webapi.Domain.Pelicula;
import org.springframework.data.repository.CrudRepository;

public interface IPeliculaRepository extends CrudRepository<Pelicula,Long> {
}
