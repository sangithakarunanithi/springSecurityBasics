package MomentoDesignPattern;

//Snapshot of account state - POJO class
public class Pojo_Snapshot_AccountMemento {

    private final  int balance; // note : final
//final is used to make the memento immutable, so the saved state cannot be changed after creation.
//If the snapshot itself can change ❌, rollback becomes unreliable.. so final, and no setter

    public Pojo_Snapshot_AccountMemento(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}


