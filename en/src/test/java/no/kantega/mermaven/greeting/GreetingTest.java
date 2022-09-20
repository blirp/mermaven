package no.kantega.mermaven.greeting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreetingTest {
    @Test
    void testGreeting() {
        assertEquals("Hello!", new Greeting().get());
    }
}
