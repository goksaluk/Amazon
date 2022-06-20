package com.amazon.step_definitions;

import com.amazon.utilities.ConfigurationReadar;
import com.amazon.utilities.ConfigurationReadar;
import com.amazon.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;


public class Hooks {
    @Before()
    public void setUp() {

        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().get(ConfigurationReadar.get("url"));
    }


    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("Test failed");
            byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");

        }else {
            System.out.println("Cleanup!");
            System.out.println("Test completed");
        }

        Driver.close();
    }
}
