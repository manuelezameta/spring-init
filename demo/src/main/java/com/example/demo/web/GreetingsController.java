package com.example.demo.web;

import com.example.demo.domain.Greeting;
import com.example.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingsController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public List<Greeting> getGreetings() {
        return greetingService.getGreetings();
    }

    @RequestMapping(value = "/greeting/{id}", method = RequestMethod.GET)
    public Greeting getGreeting(@PathVariable("id") long id) {
        return greetingService.getGreeting(id);
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    public Greeting addGreeting(@RequestBody Greeting greeting) {
        return greetingService.addGreeting(greeting);
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.PUT)
    public Greeting updateGreeting(@RequestBody Greeting greeting) {
        return greetingService.updateGreeting(greeting);
    }

    @RequestMapping(value = "/greeting/{id}", method = RequestMethod.DELETE)
    public void deleteGreeting(@PathVariable("id") long id) {
        greetingService.deleteGreeting(id);
    }
}
