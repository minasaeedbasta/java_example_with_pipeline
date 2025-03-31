package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void testHelloMessage() {
        HelloController controller = new HelloController();
        String response = controller.sayHello();
        assertThat(response).isEqualTo("Hello, DevOps!");
    }

    @Test
    void testHiMessage() {
        HelloController controller = new HelloController();
        String response = controller.sayHi();
        assertThat(response).isEqualTo("Hi, DevOps!");
    }
}
