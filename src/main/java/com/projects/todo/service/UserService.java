package com.projects.todo.service;

import com.projects.todo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sstoica on 5/18/2018.
 */
public interface UserService {
    User registerUser(User user);

    User getOne(Long id);
}
