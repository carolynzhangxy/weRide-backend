package com.weride.repository;

import com.weride.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    List<User> findByFirstName(String firstName);

    Optional<User> findByEmailAndPassword(String email, String password);

    Optional<User> findByVerificationCodeAndEmail(String verificationCode, String email);
}
