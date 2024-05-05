package com.soaf.soaf_be.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts/")
@Tag(name = "Posts Controller", description = "This REST controller provide servcies to manage posts")
public class PostController {
    // @Autowired
    // private userService UserService;

    @GetMapping
    @ResponseStatus(code= HttpStatus.OK)
    @Operation(summary = "get posts")
    public String getUsers() {
        return "This endpoint returns a list of posts";
    }
}
