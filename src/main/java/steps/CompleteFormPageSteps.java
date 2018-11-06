package steps;

import pages.ComleteFormPage;
import pages.SelectPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

/**
 * Created by Anton 06.11.2018
 */

public class CompleteFormPageSteps {

    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        new ComleteFormPage().fillField(field, value);
    }

    @Step("поле {0} заполнено значением {1}")
    public void checkFillField(String field, String value){
        String actual = new ComleteFormPage().getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }

    @Step("в поле {0} присутствует сообщение об ошибке {1}")
    public void checkErrorMessageField(String field, String value){
        new ComleteFormPage().checkFieldErrorMessage(field, value);
    }

    @Step("заголовок страницы - Отправить заявку равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new ComleteFormPage().insured0_surname.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("заполняются поля")
    public void fillFields(HashMap<String, String> fields){
        fields.forEach((k, v)-> fillField(k,v));
    }

    @Step("поля заполнены верно")
    public void checkFillFields(HashMap<String, String> fields){
        fields.forEach((k, v)-> checkFillField(k,v));
    }

    @Step("выполнено нажатие на Оформить")
    public void clicsendButonNext(){
        new ComleteFormPage().sendButonNext.click();
    }

}
