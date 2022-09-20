package no.kantega.mermaven;

import no.kantega.mermaven.greeting.Greeting;
import no.kantega.mermaven.greeting.OtherGreeting;

public class Main {
    public static void main(
        final String[] args) 
    {
        System.out.println(new Greeting().get());
        System.out.println(new OtherGreeting().get());
    }
}