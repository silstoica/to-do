package com.projects.todo.repository;

import com.projects.todo.model.Task;
import com.projects.todo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by sstoica on 5/18/2018.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
