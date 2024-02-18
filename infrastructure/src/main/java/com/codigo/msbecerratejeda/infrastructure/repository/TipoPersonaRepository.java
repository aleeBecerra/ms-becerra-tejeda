package com.codigo.msbecerratejeda.infrastructure.repository;

import com.codigo.msbecerratejeda.infrastructure.entity.TipoDocumentoEntity;
import com.codigo.msbecerratejeda.infrastructure.entity.TipoPersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface TipoPersonaRepository extends JpaRepository<TipoPersonaEntity, Long> {
    TipoPersonaEntity findByCodTipo(@Param("codTipo") String codTipo);
}
