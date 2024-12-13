package com.juansefdz.AluraForumChallenge.infraestructure.services.abstract_services;

public interface UpdateService<REQUEST, RESPONSE, ID> {
    RESPONSE update(ID id, REQUEST request);
}