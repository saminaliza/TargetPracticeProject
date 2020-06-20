package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    public static void userCanScrollPage() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        jse.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(5000);
    }

//    @FindBy(id = "search")
//    WebElement searchBox;

    WebElement search = driver.findElement(By.id("search"));
//    @FindBy(className = "SearchInputButton-sc-1opoijs-0 gpTjzt")
//    WebElement searchBtn;
    @FindBy(css = "button[data-test='btnSearch']")
    WebElement searchBtn;
    @FindBy(linkText = "Categories")
    WebElement categoriesDD;
    //WebElement backToMainMenu = driver.findElement(By.linkText("Main Menu"));
    @FindBy(linkText = "Main Menu")
    WebElement mainMenu;
    @FindBy(partialLinkText = "Deals")
    WebElement deals;
    @FindBy(xpath = "//*[@id=\"leftNav-deals\"]/a/div")
    WebElement dealFromMainMenu;
    @FindBy(css = "div[class='h-text-bold h-text-md']")
    WebElement finStore;
    @FindBy(id = "zipOrCityState")
    WebElement storeSearchBox;
    @FindBy(css = "button[data-test=\"storeLocationSearch-button\"]")
    WebElement storeSearchBtn;

    public void userCanSearchProducts(String item) throws InterruptedException {
        search.sendKeys(item);
        searchBtn.click();
        //Thread.sleep(2000);
    }
    public void userCanCheckForCategories () throws InterruptedException {
        categoriesDD.click();
        mainMenu.click();
        Thread.sleep(2000);
        dealFromMainMenu.click();
        //Thread.sleep(2000);
    }
    public void userCanLookForStores(String area) throws InterruptedException {
        finStore.click();
        storeSearchBox.sendKeys(area);
        storeSearchBtn.click();
        //Thread.sleep(5000);
    }

}
