package MomentoDesignPattern;

public class MomentoMainClass {

    public static void main(String[] args) {

        Originator_BankAccount account = new Originator_BankAccount(10000);
        Caretaker_Transaction_Manager txn = new Caretaker_Transaction_Manager();

            txn.begin(account);
        System.out.println("Initial: " + account.getBalance());
            account.withdraw(200);
        System.out.println("after 200 withdrawal : " + account.getBalance());
            txn.rollback(account);
        System.out.println("after rollback : " + account.getBalance());


    }

}
