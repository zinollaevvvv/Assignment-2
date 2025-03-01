package org.example;

import org.springframework.stereotype.Component;

@Component

public class EagerB {
    public EagerB() {
        System.out.println("eager single bean initialized");
    }
}
