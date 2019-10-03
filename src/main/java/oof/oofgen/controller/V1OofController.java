package oof.oofgen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@Api(value = "Oofgen API Version 1", tags={ "Oofgen API" })

public class V1OofController {


    @Autowired
    V1OofController() {}

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
