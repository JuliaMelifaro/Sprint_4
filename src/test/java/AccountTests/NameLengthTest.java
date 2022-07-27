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
    private final boolean result;

    public NameLengthTest(String nameToCheck, boolean result)
    {
        this.nameToCheck = nameToCheck;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"E2", false},                              // 2 символа
                {"Christopher Columbus", false},            // 20 символов
                {"Q E", true},                              // 3 символа (нижняя граница)
                {"Franklin DRoosevelt", true}               // 19 символов (верхняя граница)
        };
    }

    @Test
    @DisplayName("Различная длина имени")
    @Description("Проверка, что программа принимает только имена длиной [3,19] символов")
    public void wrongSpacePositions() {
        Account someClient = new Account(nameToCheck);
        MatcherAssert.assertThat(someClient.checkNameToEmboss(), is(result));
    }
}
