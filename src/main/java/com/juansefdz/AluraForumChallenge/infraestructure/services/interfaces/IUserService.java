package com.juansefdz.AluraForumChallenge.infraestructure.services.interfaces;

import com.juansefdz.AluraForumChallenge.api.dto.request.create.UserRequest;
import com.juansefdz.AluraForumChallenge.api.dto.request.update.UserUpdate;
import com.juansefdz.AluraForumChallenge.api.dto.response.UserResponse;
import com.juansefdz.AluraForumChallenge.infraestructure.services.abstract_services.*;

public interface IUserService extends
        CreateService<UserRequest, UserResponse>,
        DeleteService<Long>,
        UpdateService<UserUpdate, UserResponse, Long>,
        GetAllService<UserResponse>,
        GetByIdService<UserResponse, Long> {
}
