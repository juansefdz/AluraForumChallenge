package com.juansefdz.AluraForumChallenge.domain.repositories;

import com.juansefdz.AluraForumChallenge.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
