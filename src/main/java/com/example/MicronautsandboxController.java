package com.example;

import io.micronaut.http.annotation.*;

@Controller("/micronautsandbox")
public class MicronautsandboxController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}