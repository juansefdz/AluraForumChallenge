package com.juansefdz.AluraForumChallenge.domain.repositories;

import com.juansefdz.AluraForumChallenge.domain.entities.TopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<TopicEntity, Long> {
}
