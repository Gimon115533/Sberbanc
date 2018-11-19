import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

import java.util.HashMap;

/**
 * Created by Anton 06.11.2018
 */

public class ExampleTest extends BaseSteps {
    CompleteFormPageSteps completeFormPageSteps = new CompleteFormPageSteps();
    MainPageSteps mainPageSteps = new MainPageSteps();
    SelectPageStaps selectPageStaps = new SelectPageStaps();
    TravelSteps travelSteps = new TravelSteps();

    HashMap<String, String> testData = new HashMap<>();

    @Title("Заявка на страховку")
    @Test
    public void Test(){
        testData.put("первая фамилия", "Ivanov");
        testData.put("первое имя","Ivan");
        testData.put("первая др","01.01.1980");
        testData.put("фамилия","Фамилия");
        testData.put("имя","Имя");
        testData.put("отчество","Отчество");
        testData.put("др","01.01.1980");
        testData.put("серия","1234");
        testData.put("номер","123456");
        testData.put("дата","01.01.2015");
        testData.put("кем","кем");

        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Страхование']"))));


//        mainPageSteps.selectMenuItem("Страхование");
        mainPageSteps.insurance();
//        mainPageSteps.selectMenuInsurance("Путешествия и покупки");
        mainPageSteps.insuranceTrip();
        travelSteps.goToSendAppPage();
        swetchPage();
        selectPageStaps.clicButonMinimaize();
        selectPageStaps.goToNetPage();
        completeFormPageSteps.checkPageTitle("Введите данные застрахованных латинскими буквами, как в загранпаспорте");

        completeFormPageSteps.fillFields(testData);

        completeFormPageSteps.clicsendButonNext();
        completeFormPageSteps.checkFillFields(testData);
        completeFormPageSteps.checkErrorMessageField("Заполнены не все обязательные поля", "Заполнены не все обязательные поля");
    }

}
