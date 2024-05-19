package com.soaf.soaf_be.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@ResponseBody
public class MainController {

    @GetMapping("/")
    @ResponseStatus(code= HttpStatus.OK)
    @Operation(summary = "get main")
    public String mainP() {

        return "main Controller";
    }
}