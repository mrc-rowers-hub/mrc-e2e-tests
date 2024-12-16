package com.mersey.rowing.club.e2e_testing.config;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.mersey.rowing.club.e2e_testing.config.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        DriverManager.getDriver();
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
