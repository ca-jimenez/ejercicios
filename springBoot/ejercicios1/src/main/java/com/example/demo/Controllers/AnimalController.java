package com.example.demo.Controllers;

import com.example.demo.Entities.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    private final AtomicLong contador = new AtomicLong();

    @GetMapping("/hi")
    public Greeting sayHi(@RequestParam(value = "name", defaultValue = "World") String name) {

        return new Greeting(
                contador.incrementAndGet(),
                "Hi, " + name + "!",
                this.getClass().getSimpleName());
    }

    @GetMapping("/bye/{name}")
    public Greeting sayBye(@PathVariable(value = "name") String name) {

        return new Greeting(
                contador.incrementAndGet(),
                "Goodbye, " + name + "!",
                this.getClass().getSimpleName());
    }
}
