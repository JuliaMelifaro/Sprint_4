package credit_card;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    // Проверяет можно ли печатать имя на банковской карте
    public boolean checkNameToEmboss() {
        return checkNameLength() && checkSpacesPlace() && checkAmountOfSpaces();
    }

    // Проверяет что количество символом [3,19]
    private boolean checkNameLength() {
        return (name.length() >= 3 && name.length() <= 19);
    }

    // Проверяет что в строке только один пробел
    private boolean checkAmountOfSpaces() {
        String withoutSpaces = name.replace(" ", "");
        return (withoutSpaces.length() == (name.length() - 1));
    }

    // Проверяет что пробел расположен не в начале или конце строки
    private boolean checkSpacesPlace() {
        return !(name.startsWith(" ")||name.endsWith(" "));
    }


}
