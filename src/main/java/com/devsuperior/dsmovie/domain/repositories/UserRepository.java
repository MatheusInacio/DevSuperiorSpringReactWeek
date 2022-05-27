package com.devsuperior.dsmovie.domain.repositories;

import java.util.Optional;

import com.devsuperior.dsmovie.domain.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}
