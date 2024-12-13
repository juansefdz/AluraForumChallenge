package com.juansefdz.AluraForumChallenge.infraestructure.services.abstract_services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GetAllService <RESPONSE> {
    Page<RESPONSE> getAll(Pageable pageable);
}
