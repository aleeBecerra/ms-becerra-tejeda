package com.codigo.msbecerratejeda.domain.ports.out;

import com.codigo.msbecerratejeda.domain.aggregates.dto.PersonaDTO;
import com.codigo.msbecerratejeda.domain.aggregates.request.RequestPersona;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceOut {
    PersonaDTO crearPersonaOut(RequestPersona requestPersona);
    Optional<PersonaDTO> obtenerPersonaOut(String numDoc);
    List<PersonaDTO> obtenerTodosOut();
    List<PersonaDTO> obtenerTodosPorEstadoOut(String estado);
    PersonaDTO actualizarOut(Long id, RequestPersona requestPersona);
    PersonaDTO deleteOut(Long id);
}
