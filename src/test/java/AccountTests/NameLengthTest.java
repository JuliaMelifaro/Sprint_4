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
public class NameLengthTest {
    private final String nameToCheck;

    public NameLengthTest(String nameToCheck) {
        this.nameToCheck = nameToCheck;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"E2"},                             // 2 символа
                {"Christopher Columbus"}            // 20 символов
        };
    }

    @Test
    @DisplayName("Неверная длина имени")
    @Description("Проверка, что программа не принимает имена неверной длины: менее 3 или более 19")
    public void wrongSpacePositions() {
        Account someClient = new Account(nameToCheck);
        MatcherAssert.assertThat(someClient.checkNameToEmboss(), is(false));
    }
}
