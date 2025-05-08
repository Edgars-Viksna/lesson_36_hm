public class BankAccount {
    private Person owner;
    private String iban;
    private Double balance;

    public BankAccount(Person owner, String iban, Double balance) {
        this.owner = owner;
        this.iban = iban;
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public String getIban() {
        return iban;
    }

    public Double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount{");
        sb.append("owner=").append(owner);
        sb.append(", iban='").append(iban).append('\'');
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
