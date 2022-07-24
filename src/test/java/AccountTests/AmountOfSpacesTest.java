package AccountTests;

import credit_card.Account;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class AmountOfSpacesTest {
    private final String nameToCheck;

    public AmountOfSpacesTest(String nameToCheck) {
        this.nameToCheck = nameToCheck;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"JKRowling"},                      // 0 пробелов
                {"Martin Luther King"}              // 2 пробела
        };
    }

    @Test
    @DisplayName("Неверное количество пробелов")
    @Description("Проверка, что программа не принимает записи, в которых более 1 пробела")
    public void wrongSpacesAmount() {
        Account someClient = new Account(nameToCheck);
        MatcherAssert.assertThat(someClient.checkNameToEmboss(), is(false));
    }
}
