package com.example.demo.persistence;

import com.example.demo.domain.Greeting;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class GreetingDAO {
    private static final Map<Long, Greeting> GREETINGS_MAP = new HashMap<>();

    static {
        init();
    }

    private static void init() {
        Greeting greeting = new Greeting(1,"Manuel", 12);
        GREETINGS_MAP.put(greeting.getId(), greeting);
    }

    public List<Greeting> getGreetings() {
        Collection<Greeting> c = GREETINGS_MAP.values();
        List<Greeting> list = new ArrayList<>();
        list.addAll(c);
        return list;
    }

    public Greeting getGreeting(long id) {
        return GREETINGS_MAP.get(id);
    }

    public Greeting addGreeting(Greeting greeting) {
        GREETINGS_MAP.put(greeting.getId(), greeting);
        return greeting;
    }

    public Greeting updateGreeting(Greeting greeting) {
        GREETINGS_MAP.put(greeting.getId(), greeting);
        return greeting;
    }

    public void deleteGreeting(long id) {
        GREETINGS_MAP.remove(id);
    }
}
