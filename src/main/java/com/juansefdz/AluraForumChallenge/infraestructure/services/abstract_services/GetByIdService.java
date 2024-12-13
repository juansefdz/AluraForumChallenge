package com.juansefdz.AluraForumChallenge.infraestructure.services.abstract_services;

import java.util.Optional;

public interface GetByIdService<RESPONSE, ID> {
    Optional<RESPONSE> getById(ID id);
}
