package util;


import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import webdriver.Driver;
import cucumber.api.java.After;

import java.io.File;
import java.io.IOException;

public class GlobalHooks {
    private static WebDriver driver;

//    TODO: See why it does not work
    @After
    public void ready(Scenario scenario) {
        String scenarioName = scenario.getName();
        boolean isFailed = scenario.isFailed();
        if (isFailed) {
            System.err.println(scenarioName + " Scenario has failed!");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
