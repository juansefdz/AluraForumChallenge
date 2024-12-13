package com.juansefdz.AluraForumChallenge.infraestructure.services;

import com.juansefdz.AluraForumChallenge.api.dto.request.create.UserRequest;
import com.juansefdz.AluraForumChallenge.api.dto.request.update.UserUpdate;
import com.juansefdz.AluraForumChallenge.api.dto.response.UserResponse;
import com.juansefdz.AluraForumChallenge.domain.entities.UserEntity;
import com.juansefdz.AluraForumChallenge.domain.repositories.UserRepository;
import com.juansefdz.AluraForumChallenge.infraestructure.mappers.UserMapper;
import com.juansefdz.AluraForumChallenge.infraestructure.services.interfaces.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class UserService implements IUserService {

    @Autowired
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponse create(UserRequest userRequest) {
        UserEntity user = userMapper.toEntity(userRequest);
        return userMapper.toResponse(this.userRepository.save(user));
    }

    @Override
    public void delete(Long id) {
        this.userRepository.delete(this.find(id));
    }

    @Override
    public Page<UserResponse> getAll(Pageable pageable) {
        return userRepository.findAll(pageable).map(userMapper::toResponse);
    }

    @Override
    public Optional<UserResponse> getById(Long id) {
      return Optional.ofNullable(this.userMapper.toResponse(this.find(id)));
    }

    @Override
    public UserResponse update(Long id, UserUpdate userUpdate) {
        return null;
    }

    private UserEntity find(Long id) {
        return this.userRepository.findById(id).orElseThrow(() -> new RuntimeException("No user was found with this ID: " + id));
    }
}
