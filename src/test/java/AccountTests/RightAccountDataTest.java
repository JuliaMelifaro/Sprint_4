package AccountTests;

import credit_card.Account;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class RightAccountDataTest {
    String nameToCheck = "Mother Teresa";

    @Test
    @DisplayName("Корректный ввод данных")
    @Description("Проверка, что программа принимает корректные данные")
    public void rightAccountDataTest() {
        Account someClient = new Account(nameToCheck);
        MatcherAssert.assertThat(someClient.checkNameToEmboss(), is(true));
    }
}
