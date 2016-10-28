package com.packtpub.mastering.selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by simon.wilby on 28/10/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty"},
        features = "src/test/resources")


public class RunCukesTest {
}
