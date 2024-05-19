package com.soaf.soaf_be.controllers;

import com.soaf.soaf_be.dto.JoinDTO;
import com.soaf.soaf_be.service.JoinService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@ResponseBody
@Tag(name = "Home Controller", description = "This REST controller provide servcies to manage join")
public class JoinController {

    private final JoinService joinService;

    public JoinController(JoinService joinService) {
        // AutoWired 보단 생성자 주입이 더 권장된다고 함
        this.joinService = joinService;
    }

    @PostMapping("/join")
    @ResponseStatus(code= HttpStatus.OK)
    @Operation(summary = "join")
    public String joinProcess(JoinDTO joinDTO) {

        System.out.println(joinDTO.getUsername());
        joinService.joinProcess(joinDTO);

        return "ok";
    }
}