package com.soaf.soaf_be.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    @ResponseStatus(code= HttpStatus.OK)
    @Operation(summary = "get main")
    public String mainP() {
        return "<pre>                                                                                                                                                                                      \\\n" +
                "                                                                                                                                                                                      \\\n" +
                "                                                                                                                                                                                      \\\n" +
                "                                                                                                                                                                                      \\\n" +
                "                                              @@@@                                                                                                                                  \\\n" +
                "                                           @@@@@@@@@                                                                                                                                 \\\n" +
                "                                          @@@    @@@                             @@@@@@@@                                                                                            \\\n" +
                "                                         @@@     @@@@     @@@@@@@@@@@@@@@@      @@@    @@@                                                                                          \\\n" +
                "                                         @@@    @@@@@@@@@@@=            %@@@@@@@@@     @@@                                                                                          \\\n" +
                "                                          @@@@ =@@@@@                        @@@@@     @@@                                                                                          \\\n" +
                "                                            @@@@@            @@@         #@     @@@@ @@@@                                                                                           \\\n" +
                "                                          @@@@              @@@@        @@@       @@@@@                                                                                             \\\n" +
                "                                        @@@@                                        @@@@@                                                                                          \\\n" +
                "                                       @@@                                            @@@@                                                                                         \\\n" +
                "                                     @@@@                            .=                @@@@                                                                                        \\\n" +
                "                                    @@@                          @@@@@@                 @@@@                                                                                       \\\n" +
                "                                   @@@                            @@@@     @             @@@@                                                                                      \\\n" +
                "                                   @@.                       @@    :@@@@@@@@              @@@@            @@@@                                                                     \\\n" +
                "                                  @@@                         @@@@@@                       @@@@              @@@                                                                    \\\n" +
                "                                 @@@@                                                       @@@           @@@  @@                                                                   \\\n" +
                "                      @          @@@                                                        @@@           @@@@ @@@                                                                  \\\n" +
                "                  @@@@@          @@@                                                        @@@           @@@  @@@                                                                  \\\n" +
                "                 @@@ @@@         @@@                                                        @@@          @@@  @@@@                                                                  \\\n" +
                "                @@@ @@@          @@@                                                        @@@           @@@@@@                                                                    \\\n" +
                "                @@@ @@@          @@@.                                                       @@@                                                                                     \\\n" +
                "                @@@  @@@@        @@@@                                                       @@@                                                                                     \\\n" +
                "                 @@@@            @@@@                                                      @@@@                                                                                     \\\n" +
                "                   @@@@@          @@@                                                     =@@@                                                                                      \\\n" +
                "                                   @@@                                                    @@@                                                                                       \\\n" +
                "                                 @@@@@@-                                                 @@@@@                                                                                      \\\n" +
                "                               @@@                                                         @@@@                                                                                     \\\n" +
                "                              @@                                                             @@@                                                                                    \\\n" +
                "                             @@@   -@@@@@@@                                    :=+=*@@       @@@@                                                                                   \\\n" +
                "                             @@@         @@@@                                @@@@@@@@@       @@@                                                                                    \\\n" +
                "                              @@@#        @@=                                @@             @@@                                                                                     \\\n" +
                "                                 @@@@@@@@@@                                  @@@@@@   =@@@@@@@@@  @@@                                                                               \\\n" +
                "                                           +                                      +@@@@.     @@@@@@@@@@                                                                             \\\n" +
                "                                          @@@@                                                @@@    @@@                                                                            \\\n" +
                "                                           @@@@                                               -@@    .@@                                                                            \\\n" +
                "                                            @@@                                                @@-   @@@                                                                            \\\n" +
                "                                             @@@                                               @@-  @@@                                                                             \\\n" +
                "                                              @@@                                              @@@                                                                                  \\\n" +
                "                                               @@@                                             @@                                                                                   \\\n" +
                "                                               @@@@##                                ::      .@@@                                                                                   \\\n" +
                "                                            @@@                                   @@@@:      -@                                                                                     \\\n" +
                "                                          @@@@         #@@@@@@@@@@@@@@#       # %@@     -@@@                                                                                        \\\n" +
                "                                          @@@@    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=    @@@                                                                                          \\\n" +
                "                                           @@@    @@@                           @@@    @@@                                                                                          \\\n" +
                "                                            @@@   @@@@                          @@@-    @@                                                                                          \\\n" +
                "                                             @@@   %@@                           @@@@   @@                                                                                          \\\n" +
                "                                              @@@@  @@                             @@@@@@@                                                                                          \\\n" +
                "                                                                                                                                                                                      \\\n" +
                "                                                                                                                                                                                      \\\n" +
                "                                                                                                                                                                                      \\\n" +
                "                                                            soaf api server                                                                                                         \\\n" +
                "                                               <a href='https://soaf.me/api/swagger-ui/index.html#'>https://soaf.me/api/swagger-ui/index.html#</a>                                        \n" +
                "</pre>";
    }
}
