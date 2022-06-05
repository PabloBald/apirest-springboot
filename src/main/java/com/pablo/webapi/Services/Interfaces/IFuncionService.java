package com.pablo.webapi.Services.Interfaces;

import com.pablo.webapi.DTOs.FuncionDTO;
import com.pablo.webapi.DTOs.POSTFuncionDTO;
import com.pablo.webapi.Domain.Funcion;
import com.pablo.webapi.Utils.ResponseObject;

import java.util.List;

public interface IFuncionService {
    ResponseObject crear(POSTFuncionDTO f);
    List<POSTFuncionDTO> listarFunciones();
    List<Funcion> listarFuncionesPorSala(Long sala_id);
}

