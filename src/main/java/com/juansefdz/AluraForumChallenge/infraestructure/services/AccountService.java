package com.juansefdz.AluraForumChallenge.infraestructure.services;

import com.juansefdz.AluraForumChallenge.api.dto.request.create.AccountRequest;
import com.juansefdz.AluraForumChallenge.api.dto.response.AccountResponse;
import com.juansefdz.AluraForumChallenge.infraestructure.services.interfaces.IAccountService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class AccountService implements IAccountService {
    @Override
    public AccountResponse create(AccountRequest accountRequest) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Page<AccountResponse> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<AccountResponse> getById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public AccountResponse update(Long aLong, AccountRequest accountRequest) {
        return null;
    }
}
