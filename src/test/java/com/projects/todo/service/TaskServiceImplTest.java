package com.projects.todo.service;

import com.projects.todo.repository.TaskRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

import static org.junit.Assert.*;

public class TaskServiceImplTest {

    @TestConfiguration
    static class TaskServiceImplTestContextConfiguration {

        @Bean
        public TaskService taskService() {
            return new TaskServiceImpl();
        }
    }

    @Autowired
    private TaskService taskService;

    @MockBean
    private TaskRepository taskRepository;


    @Test
    public void save() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void getOne() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void findAllByUser() {
    }

    @Test
    public void update() {
    }
}