package com.codigo.msbecerratejeda.domain.ports.in;

import com.codigo.msbecerratejeda.domain.aggregates.response.ResponseReniec;

public interface ReniecServiceIn {
    ResponseReniec getInfoIn(String numero);
}