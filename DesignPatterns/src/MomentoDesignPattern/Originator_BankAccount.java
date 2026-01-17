package MomentoDesignPattern;

//originator
public class Originator_BankAccount {

    public int balance;

    public Originator_BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            throw new RuntimeException("Insufficient balance");
        }
        balance -= amount;
    }

    public Pojo_Snapshot_AccountMemento saveState(){
        return new Pojo_Snapshot_AccountMemento(balance);
    }

    // Rollback
    public void restore(Pojo_Snapshot_AccountMemento memento) {
        this.balance = memento.getBalance();
    }
}
