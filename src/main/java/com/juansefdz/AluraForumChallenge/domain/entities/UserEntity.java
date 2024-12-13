package com.juansefdz.AluraForumChallenge.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne(mappedBy = "user")
    private AccountEntity account;

    @OneToMany(mappedBy = "user")
    private List<TopicEntity> topics;
}


