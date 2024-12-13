package com.juansefdz.AluraForumChallenge.infraestructure.services.abstract_services;

public interface CreateService<REQUEST, RESPONSE> {
    RESPONSE create(REQUEST request);
}