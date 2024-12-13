package com.juansefdz.AluraForumChallenge.infraestructure.services.abstract_services;

public interface DeleteService<ID> {
    void delete(ID id);
}