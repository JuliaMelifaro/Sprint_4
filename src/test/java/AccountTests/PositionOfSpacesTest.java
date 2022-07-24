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
public class PositionOfSpacesTest {
    private final String nameToCheck;

    public PositionOfSpacesTest(String nameToCheck) {
        this.nameToCheck = nameToCheck;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {" Charles Darwin"},                    // Пробел в начале строки
                {"Albert Einstein "}                    // Пробел в конце строки
        };
    }

    @Test
    @DisplayName("Неверное расположение пробелов")
    @Description("Проверка что программа не принимает пробелы в начале и конце строки")
    public void wrongSpacePositions() {
        Account someClient = new Account(nameToCheck);
        MatcherAssert.assertThat(someClient.checkNameToEmboss(), is(false));
    }
}
