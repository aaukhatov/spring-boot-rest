package com.aukhatov.template.controller.api;

import com.aukhatov.template.domain.Hello;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
@Api(value = "/api/v1/files", description = "API version 1")
public class HelloController {

    @ApiOperation(
            value = "Hello",
            notes = "Say Hello!")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Hello"),
            @ApiResponse(code = 400, message = "Bad hello request")
    })
    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    private Hello hello() {
        return new Hello("Hello world!");
    }
}
