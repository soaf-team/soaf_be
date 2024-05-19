package com.soaf.soaf_be.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class AdminController {

    @GetMapping("/admin")
    @ResponseStatus(code= HttpStatus.OK)
    @Operation(summary = "get admin")
    public String adminP() {

        return "admin Controller";
    }
}