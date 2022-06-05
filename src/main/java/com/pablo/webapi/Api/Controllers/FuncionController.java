package com.pablo.webapi.Api.Controllers;

import com.pablo.webapi.DTOs.FuncionDTO;
import com.pablo.webapi.DTOs.POSTFuncionDTO;
import com.pablo.webapi.Services.Interfaces.IFuncionService;
import com.pablo.webapi.Utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funciones")
public class FuncionController {
    @Autowired
    private IFuncionService service;

    @PostMapping("/create")
    @DateTimeFormat(pattern = "yyyy-MM-dd 'T' HH:mm")
    public ResponseObject crearFuncion(@RequestBody POSTFuncionDTO f){
        return service.crear(f);
    }

    @GetMapping("/")
    public List<POSTFuncionDTO> listarFunciones(){
        return service.listarFunciones();
    }

    @GetMapping("/p/{id}")
    public List<FuncionDTO> listarFuncionesPorPelicula(@PathVariable(name = "id") Long id){
        return service.listarFuncionesPorPelicula(id);
    }
   //TODO: Listar en un rango horario


}
