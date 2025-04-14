package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage
{
    // constructor
    public homePage(WebDriver driver)
    {
        super(driver);

    }
    //locaters
    @FindBy(xpath = "span[text()='Create a New Model']")
    private WebElement createnewmodellink;

    //actions
    public void clickoncreatemodellink()
    {

        createnewmodellink.click();
    }

}
