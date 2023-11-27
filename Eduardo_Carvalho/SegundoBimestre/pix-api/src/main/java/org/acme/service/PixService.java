package org.acme.service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.acme.domain.dto.PixDTO;
import org.acme.domain.usercases.CriarPix;
import org.acme.infra.repositories.CCPixRepository;

@ApplicationScoped
public class PixService {

    @Inject
    CCPixRepository ccPixRepository;

    public Response genPix(PixDTO dto) {

        CriarPix createPix = new CriarPix(ccPixRepository);

        PixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }
}

