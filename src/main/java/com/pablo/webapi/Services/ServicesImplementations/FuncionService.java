package com.pablo.webapi.Services.ServicesImplementations;

import com.pablo.webapi.DTOs.FuncionDTO;
import com.pablo.webapi.DTOs.POSTFuncionDTO;
import com.pablo.webapi.Data.Repositories.IFuncionRepository;
import com.pablo.webapi.Data.Repositories.IPeliculaRepository;
import com.pablo.webapi.Data.Repositories.ISalaRepository;
import com.pablo.webapi.Domain.Funcion;
import com.pablo.webapi.Services.Interfaces.IFuncionService;
import com.pablo.webapi.Services.Validations.IValidarFuncion;
import com.pablo.webapi.Utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class FuncionService implements IFuncionService {
    @Autowired
    IValidarFuncion validarFuncion;
    @Autowired
    ISalaRepository salaRepository;
    @Autowired
    IPeliculaRepository peliculaRepository;
    @Autowired
    private IFuncionRepository funcionRepository;

    @Override
    public ResponseObject crear(POSTFuncionDTO f) {
        ResponseObject response;
        response =validarFuncion.validarFuncionDTO(f);
        if(response.isSuccess()){
            Funcion nuevaFuncion = new Funcion();
            nuevaFuncion.setFecha(f.getFecha());
            nuevaFuncion.setHorario(f.getHorario());
            nuevaFuncion.setSala(salaRepository.findById(f.getSalaId()).orElse(null));
            nuevaFuncion.setPelicula(peliculaRepository.findById(f.getPeliculaId()).orElse(null));
            try{
                //TODO validacion de funcion
                funcionRepository.save(nuevaFuncion);
            }catch (Exception e){
                response.setSuccess(false);
                response.setContent("Error interno");
                return  response;
            }
        }
        return response;
    }

    @Override
    public List<POSTFuncionDTO> listarFunciones() {
        List<POSTFuncionDTO> lista = new ArrayList<>();
        POSTFuncionDTO f = new POSTFuncionDTO();
        for (Funcion func: funcionRepository.findAll()) {
            f.setSalaId(func.getSala().getId());
            f.setFecha(func.getFecha());
            f.setHorario(func.getHorario());
            f.setPeliculaId(func.getPelicula().getId());
            lista.add(f);
        }
        return lista;
    }

    @Override
    public List<Funcion> listarFuncionesPorSala(Long sala_id) {
        return funcionRepository.obtenerFuncionesPorSala(sala_id);
    }

    public List<FuncionDTO> obtenerFuncionesPorPeliculaId(Long id){
        //TODO Hacer query para este metodo.
        List<FuncionDTO> lst = new ArrayList<>();

        FuncionDTO func = new FuncionDTO();
        for(FuncionDTO funcion : lst){
            func.setFecha(funcion.getFecha());
            func.setHorario(funcion.getHorario());
            func.setSala(funcion.getSala());

            lst.add(func);
        }
        return lst;
    }

    private POSTFuncionDTO convertirEntidadADTO(Funcion f){
        POSTFuncionDTO funcionDTO = new POSTFuncionDTO();
        funcionDTO.setFecha(f.getFecha());
        funcionDTO.setHorario(f.getHorario());
        funcionDTO.setSalaId(f.getSala().getId());
        funcionDTO.setPeliculaId(f.getPelicula().getId());

        return funcionDTO;
    }


}
