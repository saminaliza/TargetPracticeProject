package homepageTest;

import common.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage extends CommonAPI {
    @Test
    public void userCanCheckTheURL(){
        String expected = "https://www.target.com/";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void userCanScrollTest() throws InterruptedException {
        HomePage.userCanScrollPage();
    }

    @Test
    public void testUserCanSearchProducts() throws InterruptedException{
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.userCanSearchProducts("Books");
    } //passed

    @Test
    public void testUserCheckCategories() throws InterruptedException{
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.userCanCheckForCategories();
    } //passed
    @Test
    public void testUserCanFindStores() throws InterruptedException {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.userCanLookForStores("Jamaica");
    } //passed

}
