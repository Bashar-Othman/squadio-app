package com.squadio.entity.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.squadio.entity.security.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    
  Optional<User> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}
