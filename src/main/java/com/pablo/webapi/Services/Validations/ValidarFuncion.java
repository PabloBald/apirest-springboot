package com.pablo.webapi.Services.Validations;
import com.pablo.webapi.DTOs.POSTFuncionDTO;
import com.pablo.webapi.Utils.ResponseObject;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class ValidarFuncion implements IValidarFuncion {

    @Override
    public ResponseObject validarFuncionDTO(POSTFuncionDTO func){
        ResponseObject respuesta = new ResponseObject(true, "Funcion validada.");
        String strFecha = func.getFecha().toString();
        ResponseObject fechaValida = validarFecha(strFecha);
        if(!fechaValida.isSuccess()) {
            respuesta.setContent(fechaValida.getContent());
            return respuesta;
        }
        return respuesta;
    }


    public ResponseObject validarFecha(String fecha){
        ResponseObject respuesta = new ResponseObject(true,"Formato de fecha validado correctamente");
        if(fecha.trim().equals("")){
            respuesta.setSuccess(false);
            respuesta.setContent("Se ha guardado una fecha nula.");
            return respuesta;
        }else{
            SimpleDateFormat formatoFechaValido = new SimpleDateFormat("yyyy/MM/dd");
            formatoFechaValido.setLenient(false);
            try{
                formatoFechaValido.parse(fecha);

            }catch (ParseException e){
                respuesta.setSuccess(false);
                respuesta.setContent("Formato de fecha erroneo");
                return respuesta;
            }
            return respuesta;
        }


    }
}
