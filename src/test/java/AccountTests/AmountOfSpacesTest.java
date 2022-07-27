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
    private final boolean result;

    public AmountOfSpacesTest(String nameToCheck, boolean result)
    {
        this.nameToCheck = nameToCheck;
        this.result = result;
    }


    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"JKRowling", false},                      // 0 пробелов
                {"Martin Luther King", false},             // 2 пробела
                {"Abraham Lincoln", true}                  // 1 пробел
        };
    }

    @Test
    @DisplayName("Различное количество пробелов")
    @Description("Проверка, что программа принимает только записи с одним пробелом")
    public void wrongSpacesAmount() {
        Account someClient = new Account(nameToCheck);
        MatcherAssert.assertThat(someClient.checkNameToEmboss(), is(result));
    }
}
