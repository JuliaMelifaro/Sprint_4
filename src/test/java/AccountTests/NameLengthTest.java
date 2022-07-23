package AccountTests;

import credit_card.Account;
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
    public void wrongSpacePositions() {
        Account someClient = new Account(nameToCheck);
        MatcherAssert.assertThat(someClient.checkNameToEmboss(), is(false));
    }
}
