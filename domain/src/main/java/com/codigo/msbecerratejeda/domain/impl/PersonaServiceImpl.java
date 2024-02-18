package com.codigo.msbecerratejeda.domain.impl;

import com.codigo.msbecerratejeda.domain.ports.out.PersonaServiceOut;
import com.codigo.msbecerratejeda.domain.aggregates.dto.PersonaDTO;
import com.codigo.msbecerratejeda.domain.aggregates.request.RequestPersona;
import com.codigo.msbecerratejeda.domain.ports.in.PersonaServiceIn;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaServiceIn {

    private final PersonaServiceOut personaServiceOut;
    @Override
    public PersonaDTO crearPersonaIn(RequestPersona requestPersona) {
        return personaServiceOut.crearPersonaOut(requestPersona);
    }

    @Override
    public Optional<PersonaDTO> obtenerPersonaIn(String numDoc) {
        return personaServiceOut.obtenerPersonaOut(numDoc);
    }

    @Override
    public List<PersonaDTO> obtenerTodosIn() {
        return personaServiceOut.obtenerTodosOut();
    }

    @Override
    public List<PersonaDTO> obtenerTodosPorEstadoIn(String estado) {
        return personaServiceOut.obtenerTodosPorEstadoOut(estado);
    }

    @Override
    public PersonaDTO actualizarIn(Long id, RequestPersona requestPersona) {
        return personaServiceOut.actualizarOut(id,requestPersona);
    }

    @Override
    public PersonaDTO deleteIn(Long id, RequestPersona requestPersona) {
        return personaServiceOut.deleteOut(id);
    }
}
