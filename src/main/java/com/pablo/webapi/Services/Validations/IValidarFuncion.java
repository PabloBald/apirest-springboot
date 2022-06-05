package com.pablo.webapi.Services.Validations;

import com.pablo.webapi.DTOs.POSTFuncionDTO;
import com.pablo.webapi.Utils.ResponseObject;

public interface IValidarFuncion {
    ResponseObject validarFuncionDTO(POSTFuncionDTO func);
    ResponseObject validarFecha(String fecha);
}
