package com.codigo.msbecerratejeda.application.controller;

import com.codigo.msbecerratejeda.domain.aggregates.dto.PersonaDTO;
import com.codigo.msbecerratejeda.domain.aggregates.request.RequestPersona;
import com.codigo.msbecerratejeda.domain.ports.in.PersonaServiceIn;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@OpenAPIDefinition(
        info=@Info(
                title="API-PERSONA",
                version = "1.0",
                description = "Mantenimiento de una Persona"
        )
)
@RestController
@RequestMapping("/v2/persona")
@RequiredArgsConstructor
public class PersonaController {
    private final PersonaServiceIn personaServiceIn;
    @Operation(summary = "Crea una persona")
    @PostMapping
    public ResponseEntity<PersonaDTO> registrar(@RequestBody RequestPersona requestPersona){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaServiceIn.crearPersonaIn(requestPersona));
    }
    @Operation(summary = "Obtiene una persona por numero de documento")
    @GetMapping("/{numDoc}")
    public ResponseEntity<PersonaDTO>obtenerPersona(@PathVariable String numDoc){

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.obtenerPersonaIn(numDoc).get());

    }
    @Operation(summary = "Obtener todas las personas")
    @GetMapping("/todos")
    public ResponseEntity<List<PersonaDTO>>obtenerTodos(){

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.obtenerTodosIn());

    }
    @Operation(summary = "Obtener todas las personas por Estado")
    @GetMapping("/todosxestado/{estado}")
    public ResponseEntity<List<PersonaDTO>>obtenerTodosPorEstado(String estado){

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.obtenerTodosPorEstadoIn(estado));

    }
    @Operation(summary = "Actualizar una persona")
    @PutMapping("/{id}")
    public ResponseEntity<PersonaDTO>actualizar(@PathVariable Long id,@RequestBody RequestPersona requestPersona){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.actualizarIn(id,requestPersona));

    }
    @Operation(summary = "Eliminar una persona")
    @PutMapping("/delete/{id}")
    public ResponseEntity<PersonaDTO> delete(@PathVariable Long id, @RequestBody RequestPersona requestPersona){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.deleteIn(id, requestPersona));
    }
}
