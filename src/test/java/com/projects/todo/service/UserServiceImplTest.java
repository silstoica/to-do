package com.projects.todo.service;

import com.projects.todo.model.User;
import com.projects.todo.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


public class UserServiceImplTest {
    @TestConfiguration
    static class UserServiceImplTestContextConfiguration {

        @Bean
        public UserService userService() {
            return new UserServiceImpl();
        }

        @Bean BCryptPasswordEncoder passwordEncoder(){
            return new BCryptPasswordEncoder();
        }
    }

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Before
    public void setUp(){


    }


//    @Test
//    public void registerUserTest() {
//        User user = new User();
//        String username = "user";
//        String password = passwordEncoder.encode("1234");
//        user.setUsername(username);
//        user.setPassword(password);
//
//        User registeredUser = userService.registerUser(user);
//
//        assertEquals(registeredUser.getUsername(), user.getUsername());
//        assertEquals(registeredUser.getPassword(), user.getPassword());
//    }
//
//    @Test
//    public void getOneTest(){
//        User user = new User();
//        String username = "user";
//        String password = passwordEncoder.encode("1234");
//        user.setUsername(username);
//        user.setPassword(password);
//
//        userRepository.save(user);
//
//        User userDB = userService.getOne(user.getId());
//
//        assertEquals(userDB.getUsername(), user.getUsername());
//        assertEquals(userDB.getPassword(), user.getPassword());
//    }

}