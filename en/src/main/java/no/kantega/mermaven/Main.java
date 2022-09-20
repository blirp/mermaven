package no.kantega.mermaven;

import no.kantega.mermaven.greeting.Greeting;

public class Main {
    public static void main(
        final String[] args) 
    {
        System.out.println(new Greeting().get());
    }
}