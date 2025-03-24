package com.example.Test1;

import com.example.Test1.pages.RozetkaMainPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RozetkaSearchTest extends BaseTest {

    @Test
    public void searchLaptopTest() {
        RozetkaMainPage mainPage = new RozetkaMainPage(driver);
        mainPage.open();
        mainPage.searchFor("Ноутбук Lenovo");

        assertTrue(
                mainPage.isLenovoInResults(),
                "Сторінка не містить результатів з текстом 'Lenovo'"
        );
    }
}
