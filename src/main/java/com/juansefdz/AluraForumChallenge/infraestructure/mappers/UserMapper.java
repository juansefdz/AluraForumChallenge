package com.juansefdz.AluraForumChallenge.infraestructure.mappers;

import com.juansefdz.AluraForumChallenge.api.dto.request.create.UserRequest;
import com.juansefdz.AluraForumChallenge.api.dto.response.UserResponse;
import com.juansefdz.AluraForumChallenge.domain.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity toEntity(UserRequest userEntity);

    UserResponse toResponse(UserEntity userEntity);

}
