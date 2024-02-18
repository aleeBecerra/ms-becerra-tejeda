package com.codigo.msbecerratejeda.domain.ports.in;
import com.codigo.msbecerratejeda.domain.aggregates.dto.PersonaDTO;
import com.codigo.msbecerratejeda.domain.aggregates.request.RequestPersona;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceIn {
    PersonaDTO crearPersonaIn(RequestPersona requestPersona);
    Optional<PersonaDTO> obtenerPersonaIn(String numDoc);
    List<PersonaDTO> obtenerTodosIn();
    List<PersonaDTO> obtenerTodosPorEstadoIn(String estado);
    PersonaDTO actualizarIn(Long id, RequestPersona requestPersona);
    PersonaDTO deleteIn(Long id, RequestPersona requestPersona);
}
