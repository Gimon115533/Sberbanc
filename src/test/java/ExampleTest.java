import org.junit.Test;
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
        testData.put("первая др","01011980");
        testData.put("фамилия","фамилия");
        testData.put("имя","имя");
        testData.put("отчество","отчество");
        testData.put("др","01011980");
        testData.put("серия","1234");
        testData.put("номер","123456");
        testData.put("дата","01012015");
        testData.put("кем","кем");

//        mainPageSteps.selectMenuItem("Страхование");
        mainPageSteps.insurance();
//        mainPageSteps.selectMenuInsurance("Путешествия и покупки");
        mainPageSteps.insuranceTrip();
        travelSteps.goToSendAppPage();
        swetchPage();
        selectPageStaps.clicButonMinimaize();
        selectPageStaps.goToNetPage();
        completeFormPageSteps.checkPageTitle("Задать проверяемй заголовок");

        completeFormPageSteps.fillFields(testData);

        completeFormPageSteps.checkFillFields(testData);
        completeFormPageSteps.clicsendButonNext();
        completeFormPageSteps.checkErrorMessageField("Заполнены не все обязательные поля", "Заполнены не все обязательные поля");
    }

}
