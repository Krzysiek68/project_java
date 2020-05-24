package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private static final String template2 = "Your age is %d";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name,
                             @RequestParam(value = "age", defaultValue = "20") String age) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name), String.format(template2, age));
    }

    @RequestMapping("/bye")
    public Greeting bye(@RequestParam(value = "name", defaultValue = "World") String name,
                        @RequestParam(value = "age", defaultValue = "20") String age) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name), String.format(template2, age));
    }
}