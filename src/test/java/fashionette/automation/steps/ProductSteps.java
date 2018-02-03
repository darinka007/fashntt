package fashionette.automation.steps;

import fashionette.automation.pages.HeaderPanel;
import fashionette.automation.pages.MainPage;
import fashionette.automation.pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ProductSteps {
    MainPage mainPage;
    HeaderPanel headerPanel;
    SearchPage searchPage;

    public void search_by_name(String text) {
        mainPage.open();
        headerPanel.openSearch();
        headerPanel.fillSearch(text);
        headerPanel.submitSearch();
        searchPage.get_all_searched_items();
    }

    public String get_color() {
        return "";
    }

    public void get_all_searched_items_steps() {
       searchPage.get_all_searched_items();
    }
    //  get_all_searched_items() {
//
//        //убрать локатор отсюда! добавить модель Сумка
//        List<WebElement> itemsresults = getDriver().findElements(By.cssSelector("[itemprop = \"itemListElement\"]"));
//        for (WebElement itemresult : itemsresults) {
//            System.out.println(itemresult.getText());
//        }
//        return null;
//    }

//    public void openSearchedItem(int index) {
//
//    }
}
