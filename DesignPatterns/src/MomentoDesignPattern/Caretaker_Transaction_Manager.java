package MomentoDesignPattern;

public class Caretaker_Transaction_Manager {

    private Pojo_Snapshot_AccountMemento snapshot;

    public void begin(Originator_BankAccount account){
        snapshot = account.saveState();
    }


    public void rollback(Originator_BankAccount account){
        account.restore(snapshot);
    }
}
