package workshop.spring.SpringBasics.controllers.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/api/count")
    public Integer count(Integer cislo1, Integer cislo2)
    {
        return (cislo1+cislo2);
    }

}
