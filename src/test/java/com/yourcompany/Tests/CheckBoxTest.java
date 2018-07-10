package com.yourcompany.Tests;

import com.yourcompany.Pages.GuineaPigPage;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;
import java.util.Random;

/**
 * Created by grago on 09.02.18.
 */
public class CheckBoxTest extends TestBase {

    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(browser, version, os, method.getName());
        WebDriver driver = this.getWebDriver();

        GuineaPigPage page = GuineaPigPage.visitPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());

        Random rand = new Random();

        Assert.assertTrue(rand.nextInt(40) != 0);

    }

}
