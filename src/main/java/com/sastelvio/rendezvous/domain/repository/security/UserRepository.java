package com.sastelvio.rendezvous.domain.repository.security;

import com.sastelvio.rendezvous.domain.entity.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository  extends JpaRepository<User, UUID> {
    User findByUsername(String username);

}
