package duattran.example.testcase.controller;

import java.util.concurrent.atomic.AtomicLong;

import duattran.example.testcase.entity.SampleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public SampleResponse greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new SampleResponse(counter.incrementAndGet(), String.format(template, name));
    }
}
