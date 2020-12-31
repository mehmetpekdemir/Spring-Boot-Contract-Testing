package com.mehmetpekdemir.contract.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("v1/user/{userId}")
    public User getUserByUserId(@PathVariable Long userId) {
        return User.builder() //
                .id(userId) //
                .firstName("Mehmet") //
                .lastName("Pekdemir") //
                .title("Software Engineer") //
                .build(); //
    }

    @GetMapping("v2/user/{userName}")
    public User getUserByUsername(@PathVariable String userName) {
        return User.builder() //
                .id(2L) //
                .firstName(userName) //
                .lastName("Pekdemir") //
                .title("Software Engineer") //
                .build(); //
    }

}
