package com.codigo.msbecerratejeda.domain.ports.out;

import com.codigo.msbecerratejeda.domain.aggregates.response.ResponseReniec;

public interface RestReniecOut {
    ResponseReniec getInfoReniec(String numDoc);
}
