package net.pet.food.review.foodreviewbackend.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControler {

    @GetMapping(path = "/dummy-data", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getDummy() {
        return "Here's your dummy, you dummy!";
    }
}
