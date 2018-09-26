package com.example.demo.service;

import com.example.demo.domain.Greeting;
import com.example.demo.persistence.GreetingDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class GreetingService {

    @Autowired
    GreetingDAO greetingDAO;

    public GreetingService() {
    }

    public List<Greeting> getGreetings() {
        return greetingDAO.getGreetings();
    }

    public Greeting getGreeting(long id) {
        return greetingDAO.getGreeting(id);
    }

    public Greeting addGreeting(Greeting greeting) {
        return greetingDAO.addGreeting(greeting);
    }

    public Greeting updateGreeting(Greeting greeting) {
        return greetingDAO.updateGreeting(greeting);
    }

    public void deleteGreeting(long id) {
        greetingDAO.deleteGreeting(id);
    }
}
