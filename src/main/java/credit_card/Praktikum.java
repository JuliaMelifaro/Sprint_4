package credit_card;

public class Praktikum {
    public static void main(String[] args) {
        String personData = "Mahatma Gandhi";
        Account someAccount = new Account(personData);
        System.out.println(someAccount.checkNameToEmboss());
    }
}
