package com.codigo.msbecerratejeda.infrastructure.repository;

import com.codigo.msbecerratejeda.infrastructure.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {

    Optional<PersonaEntity> findByEstado(@Param("estado") Integer estado);
    PersonaEntity findByNumDocu(@Param("numDocu") String numDocu);
}