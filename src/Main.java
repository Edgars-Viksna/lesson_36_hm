import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BankAccount> accList = new ArrayList<>();
        accList.add(new BankAccount(new Person("Alanos", "Bergos", "a.b@inbox.de"), "DE112233", 200.99));
        accList.add(new BankAccount(new Person("Barbyy", "Cimmer", "b.c@inbox.de"), "DE223344", 50.00));
        accList.add(new BankAccount(new Person("Celine", "Dionis", "c.d@inbox.de"), "DE332255", 99.99));
        accList.add(new BankAccount(new Person("Dirkos", "Einzel", "d.e@inbox.de"), "DE442266", 200000.00));
        accList.add(new BankAccount(new Person("Oskaro", "Bigalo", "o.b@inbox.de"), "DE552277", 150000.00));

        System.out.println("----------------- Get accounts with balance under 100 ---------------");
        List<BankAccount> balanceUnder100 = accList.stream().filter(bankAccount -> bankAccount.getBalance() < 100).toList();
        balanceUnder100.forEach(System.out::println);

        System.out.println("----------------- Get list of all account owners ---------------");
        List<Person> ownerList = accList.stream().map(BankAccount::getOwner).toList();
        ownerList.forEach(person -> System.out.println(person));

        System.out.println("----------------- Используя stream, сформировать лист... ---------------");
        List<String> stringList = accList.stream().filter(bankAccount -> bankAccount.getBalance() > 100000.00)
                .map(bankAccount -> {
                    Person person = bankAccount.getOwner();
                    return String.format("%s %s.; IBAN: %s ; %s", person.getlName(), person.getfName().charAt(0)
                            , bankAccount.getIban(), person.getEmail());
                }).toList();
        stringList.forEach(s -> System.out.println(s));


    }
}