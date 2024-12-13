package com.juansefdz.AluraForumChallenge.domain.repositories;

import com.juansefdz.AluraForumChallenge.domain.entities.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
}
