package com.alibou.security.demo;


import io.swagger.v3.oas.annotations.Hidden;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8081")
public class UserController {

    @GetMapping("/")
    public ResponseEntity<String> getUser() {
        // Retrieve the authenticated user or any other necessary data
        // Perform any necessary processing to get the user information

        return ResponseEntity.ok("Data returned");
    }

}
