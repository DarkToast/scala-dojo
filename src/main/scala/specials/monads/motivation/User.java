package specials.monads.motivation;

public class User {
    private final Contract contract;

    public User(Contract contract) {
        this.contract = contract;
    }

    public Contract getContract() {
        return contract;
    }
}
