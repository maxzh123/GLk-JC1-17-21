package org.example.chlitter.repos;

import org.example.chlitter.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long> {
    User findByUsername (String username);

}
