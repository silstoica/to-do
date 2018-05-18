package com.projects.todo.repository;

import com.projects.todo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sstoica on 5/18/2018.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
