package com.example.hook;

import io.cucumber.java.BeforeAll;
import jakarta.inject.Inject;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hook {

    @Inject public static String str;

    public static Boolean isStrCorrectlyInjected;

    @BeforeAll(order = 0)
    public static void beforeAll() {
        System.out.println("The injected string is: " + str);
        isStrCorrectlyInjected = str != null;
    }
}
