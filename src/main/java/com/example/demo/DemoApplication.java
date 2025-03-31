package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application entry point.
 */
@SpringBootApplication
public final class DemoApplication {
    private DemoApplication() {
        // Private constructor to prevent instantiation
    }

    /**
     * Runs the Spring Boot application.
     *
     * @param args Command-line arguments.
     */
    public static void main(final String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
