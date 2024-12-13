package com.juansefdz.AluraForumChallenge.infraestructure.services.interfaces;

import com.juansefdz.AluraForumChallenge.api.dto.request.create.AccountRequest;
import com.juansefdz.AluraForumChallenge.api.dto.response.AccountResponse;
import com.juansefdz.AluraForumChallenge.infraestructure.services.abstract_services.*;

public interface IAccountService extends
        CreateService<AccountRequest, AccountResponse>,
        DeleteService<Long>,
        UpdateService<AccountRequest, AccountResponse, Long>,
        GetAllService<AccountResponse>,
        GetByIdService<AccountResponse, Long> {

}
