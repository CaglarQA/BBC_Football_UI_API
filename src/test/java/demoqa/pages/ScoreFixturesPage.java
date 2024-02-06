package demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;
import java.util.List;

public class ScoreFixturesPage extends BasePage{

    @FindBy(xpath = "//abbr")
    public List<WebElement> teams;

}
