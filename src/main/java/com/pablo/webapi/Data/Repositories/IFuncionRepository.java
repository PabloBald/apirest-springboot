package com.pablo.webapi.Data.Repositories;

import com.pablo.webapi.Domain.Funcion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IFuncionRepository extends CrudRepository<Funcion,Long> {
/*
TODO No se debe permitir crear una función para una determinada sala que se superponga
 con otra función de la misma sala. Cada función tiene una ventana de tiempo de 2:30hs
*/
    //Obtener funcion por id pelicula
    @Query(value="SELECT * FROM funciones WHERE funciones.pelicula_id = ?1",nativeQuery = true)
    List<Funcion> getFuncionPorPelicula(Long peliculaId);
}
