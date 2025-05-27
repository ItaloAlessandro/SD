package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControllerTest {

     @Test
     public void testHello() {
         Controller controller = new Controller();
         String response = controller.hello();
         assertEquals("Hello, World!", response);
     }

}
