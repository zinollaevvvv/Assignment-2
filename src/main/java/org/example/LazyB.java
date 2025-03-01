package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyB {
    public LazyB() {
        System.out.println("lazy single bean initialized");
    }
}
