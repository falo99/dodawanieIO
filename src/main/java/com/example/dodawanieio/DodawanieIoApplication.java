package com.example.dodawanieio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DodawanieIoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DodawanieIoApplication.class, args);
    }

    public int added(int a, int b)
    {
        return a + b;
    }
}
