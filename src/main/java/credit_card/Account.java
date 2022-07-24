package credit_card;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    // Проверяет можно ли печатать имя на банковской карте
    public boolean checkNameToEmboss() {
        boolean isChecked = checkNameLength() && checkSpacesPlace() && checkAmountOfSpaces();
        return isChecked;
    }

    // Проверяет что количество символом [3,19]
    private boolean checkNameLength() {
        if (name.length() >= 3) {
            if (name.length() <= 19) {return true;}}
        return false;
    }

    // Проверяет что в строке только один пробел
    private boolean checkAmountOfSpaces() {
        String withoutSpaces = name.replace(" ", "");
        if (withoutSpaces.length() == (name.length() - 1)) return true;
        return false;
    }

    // Проверяет что пробел расположен не в начале или конце строки
    private boolean checkSpacesPlace() {
        if (name.equals(name.trim())) return true;
        return false;
    }


}
